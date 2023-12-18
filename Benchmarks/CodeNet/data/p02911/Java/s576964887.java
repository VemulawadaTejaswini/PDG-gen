import java.util.*;
import java.lang.*;



public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int Q = sc.nextInt();

        long[] point = new long[N];
        Arrays.fill(point, K-Q);
        for(int q=0; q<Q; q++){
            int A = sc.nextInt()-1;
            point[A]++;
        }
        for(int n=0; n<N; n++) System.out.println(point[n]>0 ? "Yes" : "No");
    }
}
