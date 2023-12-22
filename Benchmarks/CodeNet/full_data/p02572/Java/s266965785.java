import java.util.Scanner;
class Main {
public static void main (String[] args) { 
	Scanner in = new Scanner(System.in);
	long mod = 1000000007;
        int N = in.nextInt(); 
	long A[] = new long[N]; 
        for (int i = 0; i < N; i++) {
        A[i] = in.nextInt();
        
    }   long a = 0 ,b;
        long ans =0;
        for (int i = 0;i<N;i++) {
          
            for (int j = i+1; j < N; j++) {
                ans = (ans%mod + A[i]%mod*A[j]%mod)%mod;
            }
            } 
                
	System.out.print(ans); 

	} 
}