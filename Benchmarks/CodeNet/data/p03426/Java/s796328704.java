import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        HashMap<Integer,Integer> Ax = new HashMap();
        HashMap<Integer,Integer> Ay = new HashMap();
        for(int i=0;i<W;i++){
            for(int j=0;j<H;j++){
                int A = sc.nextInt();
                Ax.put(A, i);
                Ay.put(A, j);
            }
        }
        long Q = sc.nextLong();
        
        //System.out.println(A.get(6)[0]);
        
        for(long i=0;i<Q;i++){
            long cost=0;
            int L = sc.nextInt();
            int R = sc.nextInt();
            for(int t=L;t != R ; t+=D){
                long x = Math.abs(Ax.get(t)-Ax.get(t+D));
                long y = Math.abs(Ay.get(t)-Ay.get(t+D));
                cost += x+y;
            }
            System.out.println(cost);
        }
    }
}