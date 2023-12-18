import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int mod = 1000000007;
        int N = sc.nextInt();
        int[] T = new int[N];
        int[] A = new int[N];
        int[] r = new int[N];
        int[] l = new int[N];
        for(int i = 0; i < N; i++){
            T[i] = sc.nextInt();
            if(i == 0){
                l[i] = 1;
            } else {
                if(T[i] > T[i-1])
                    l[i] = 1;
                else
                    l[i] = T[i-1];
            }
        }
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for(int i = N-1; i >= 0; i--){
            if(i == N-1){
                r[i] = 1;
            } else {
                if(A[i] > A[i+1])
                    r[i] = 1;
                else
                    r[i] = A[i+1];
            }
        }
        sc.close();

        if(T[N-1] != A[0]){
            System.out.println(0);
        } else {
            long ans = 1;
            for(int i = 0; i < N; i++){
                ans = (ans*Math.min(l[i], r[i]))%mod;
            }
            System.out.println(ans);
        }

    }
}