import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long h = scanner.nextLong();
        List<Long> alst = new ArrayList<>();
        List<Long> blst = new ArrayList<>();
        for(int i=0;i<n;i++){
            long w = scanner.nextLong();
            long t = scanner.nextLong();
            alst.add(w);
            blst.add(t);
        }
        alst.sort(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return o2.compareTo(o1);
            }
        });
        blst.sort(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return o2.compareTo(o1);
            }
        });
        long count = 0;
        for(int i=0;i<n;i++){
            if(blst.get(i) > alst.get(0)){
                count++;
                h-=blst.get(i);
                if(h<=0) break;
            }
        }
        long dx;
        if(h<=0){
            dx=0;
        }else{
            dx = (long)Math.ceil((h*1.0)/alst.get(0));
        }
        System.out.println(count+dx);
    }
}