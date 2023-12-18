import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<ArrayList<Integer>> xs = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ys = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            ArrayList<Integer> y = new ArrayList<>();
            int a = scanner.nextInt();
            for (int j = 0; j < a; j++) {
                x.add(scanner.nextInt()-1);
                y.add(scanner.nextInt());
            }
            xs.add(x);
            ys.add(y);
        }
        int ans = 0;
        for (int i = 0; i < (1<<N); i++) {
            boolean consistent = true;
            // System.out.println(String.format("i=%d",i));
            for (int j = 0; j < xs.size(); j++) {
                ArrayList<Integer> x = xs.get(j);
                ArrayList<Integer> y = ys.get(j);
                for(int k = 0; k<x.size(); k++){
                    // System.out.println(((i>>x.get(k))&1)); 
                    // System.out.println( ((i>>j)&1) ); 
                    if((((i>>x.get(k))&1) ^ y.get(k)) == ((i>>j)&1)){
                        consistent = false;
                    }
                }
            }
            if(consistent) ans = Math.max(ans, Integer.bitCount(Integer.valueOf(i)));
        }
        System.out.println(ans);
    }
}