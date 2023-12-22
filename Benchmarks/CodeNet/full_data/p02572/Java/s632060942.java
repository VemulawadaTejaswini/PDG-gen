import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long ans = 0;
        
        for(int h = 0 ; h < N ; h++){
                A[h] = sc.nextLong();
         }
                
        for(int i = 0; i < N; i++){
            //System.out.println(i + " " + ans);
            for(int n = i + 1; n < N ; n++){
                A[i] = A[i] % 1000000007;
                A[n] = A[n] % 1000000007;
                ans = (ans + A[i] * A[n]) % 1000000007;
                //System.out.println(i + " " + n + " " + ans);
            }
        }
        
        System.out.println(ans);
    }
}