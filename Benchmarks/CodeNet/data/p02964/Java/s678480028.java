
import java.util.*;

public class Main {
    static int[][] graph;
    static int[] check;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        List<Integer> x = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        int s = sc.nextInt();
        a.add(s);
        for(int i=1;i<n;i++){
            int tmp = sc.nextInt();
            a.add(tmp);
        }

        List<List<Integer>> start = new ArrayList<>();
        start.add(new ArrayList<>());
        while(true){
            List<Integer> s_tmp = new ArrayList<>(start.get(start.size()-1));
            for(Integer e : a){
                if(s_tmp.contains(e)){
                    s_tmp.subList(s_tmp.indexOf(e), s_tmp.size()).clear();
                }
                else{
                    s_tmp.add(e);
                }
            }
            if(s_tmp.size()==0)break;
            start.add(s_tmp);
        }
        int shurui = (int)k%(start.size());
        List<Integer> res = start.get(shurui);
        for(Integer e : res){
            System.out.print(e + " ");
        }
    }
}