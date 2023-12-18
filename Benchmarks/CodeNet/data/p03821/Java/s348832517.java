import java.util.*;

public class Main {
	
	public static long rest(long a, long b){
		if(a%b==0) return 0;
		return b-(a%b);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long[] B = new long[N];
        for(int i=0;i<N;i++){
        	A[i]=sc.nextLong();
        	B[i]=sc.nextLong();
        }
        long button = 0;
        for(int i=N-1;i>=0;i--){
        	button += rest(A[i]+button,B[i]);
        }
        System.out.println(button);
    }
}