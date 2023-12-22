import java.security.cert.X509CertSelector;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    static long DEF_LARGE_VALUE = 50000000000L;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, List<List<Integer>>> xpy = new HashMap<>(); // 0 <= X+Y <= 400000  Matters 1-4 (1.Y-4.X) , 2-3  (2.X-3.Y)
        Map<Integer, List<List<Integer>>> xmy = new HashMap<>(); // -200000 <= X-Y <= 200000  Matters 1-2(2.Y-1.X) , 3-4 (3.X-4.Y)
        Map<Integer, List<List<Integer>>> xmp = new HashMap<>(); // 0 <= X <= 200000 Matters 1-3 (3.Y-1.Y)
        Map<Integer, List<List<Integer>>> ymp = new HashMap<>(); // 0 <= Y <= 200000 Matters 2-4 (2.X-4.X)
        for(int i=0;i<N;i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            String D = sc.nextLine();
            PL plane = new PL(X,Y,D);
            //System.out.println(plane);
            xpy.putIfAbsent(X+Y, newPLLists());
            xpy.get(X+Y).get(plane.D-1).add(X);

            xmy.putIfAbsent(X-Y, newPLLists());
            xmy.get(X-Y).get(plane.D-1).add(X);

            xmp.putIfAbsent(X, newPLLists());
            xmp.get(X).get(plane.D-1).add(Y);

            ymp.putIfAbsent(Y, newPLLists());
            ymp.get(Y).get(plane.D-1).add(X);
        }
        long min_time = DEF_LARGE_VALUE;


        for(List<List<Integer>> lists: xpy.values()){
            min_time = updateMinTime(min_time, lists, 0, 3);
            min_time = updateMinTime(min_time, lists, 1, 2);
        }

        for(List<List<Integer>> lists: xmy.values()){
            min_time = updateMinTime(min_time, lists, 1, 0);
            min_time = updateMinTime(min_time, lists, 2, 3);

        }
        for(List<List<Integer>> lists: xmp.values()){
            lists.get(2).sort(Comparator.naturalOrder());
            lists.get(0).sort(Comparator.naturalOrder());
            min_time = Math.min(
                    min_time,
                    getMinTime(lists.get(2), lists.get(0))*5
            );
        }
        for(List<List<Integer>> lists: ymp.values()){
            lists.get(1).sort(Comparator.naturalOrder());
            lists.get(3).sort(Comparator.naturalOrder());
            min_time = Math.min(
                    min_time,
                    getMinTime(lists.get(1), lists.get(3))*5
            );
        }


        if(min_time == DEF_LARGE_VALUE){
            System.out.println("SAFE");
        }else{
            System.out.println(min_time);
        }
    }

    private static long updateMinTime(long min_time, List<List<Integer>> lists, int largerDirection, int smallerDirection) {
        lists.get(largerDirection).sort(Comparator.naturalOrder());
        lists.get(smallerDirection).sort(Comparator.naturalOrder());
        min_time = Math.min(
                min_time,
                getMinTime(lists.get(largerDirection), lists.get(smallerDirection)) * 10
        );
        return min_time;
    }

    private static long getMinTime(List<Integer> larger, List<Integer> smaller){
        long minTime = DEF_LARGE_VALUE;
        if(larger.size() == 0 || smaller.size() == 0){
            return DEF_LARGE_VALUE;
        }
        if(larger.get(larger.size()-1) < smaller.get(0)){
            return DEF_LARGE_VALUE;
        }
        if(larger.get(0) > smaller.get(smaller.size()-1)){
            return larger.get(0) - smaller.get(smaller.size()-1);
        }
        for(Integer target:larger){
            int l=0;
            int r=smaller.size()-1;
            while(l<r){
                int m=(l+r)%2 == 0 ? (l+r)/2 : (l+r)/2+1;
                if(smaller.get(m) > target){
                    r = m-1;
                }else{
                    l = m;
                }
            }
            if(smaller.get(l) <= target){
                minTime = Math.min(minTime, target - smaller.get(l));
            }
        }
        return minTime;
    }

    private static long getMinTime_old(List<Integer> larger, List<Integer> smaller) {
        long minTime = DEF_LARGE_VALUE;
        if(larger.size() == 0 || smaller.size() == 0){
            return DEF_LARGE_VALUE;
        }
        if(larger.get(larger.size()-1) < smaller.get(0)){
            return DEF_LARGE_VALUE;
        }
        if(larger.get(0) > smaller.get(smaller.size()-1)){
            return larger.get(0) - smaller.get(smaller.size()-1);
        }
        for(Integer l:larger){
            for(Integer s:smaller){
                if(l>s){
                    minTime = Math.min(l-s, minTime);
                }
            }
        }
        return minTime;
    }

    private static List<List<Integer>> newPLLists(){
        List<List<Integer>> ret = new ArrayList<>();
        for(int i=0;i<4;i++){
            ret.add(new ArrayList<>());
        }
        return ret;
    }

    private static class PL{
        public int X,Y;
        public int D;
        public int getX(){
            return X;
        }
        public int getY(){
            return Y;
        }
        PL(int X, int Y, String Dir){
            if(Dir.contains("U")){
                D = 1;
            }else if(Dir.contains("L")){
                D = 2;
            }else if(Dir.contains("D")) {
                D = 3;
            }else {
                D = 4;
            }
            this.X = X;
            this.Y = Y;
        }
        @Override
        public String toString(){
            return X + "-" + Y + " Dir: " + D;
        }
    }

}
