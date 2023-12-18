import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for(int i=0;i<N;i++)A[i]=sc.nextLong();
		sc.close();
		
		long sum = 0;
		for(int i=0;i<N;i++)sum += A[i];
		
		long half = sum/2;
		
		long tmpsum = 0;
		int i=0;
		while(tmpsum<half) {
			tmpsum += A[i];
			i++;
		}
		
		if(i==N) {
			tmpsum = A[N-1];
		}
		//tmpsum=(long)Math.max(tmpsum, sum-tmpsum);
		
		long ans = tmpsum-sum+tmpsum;
		ans = Math.abs(ans);
		System.out.println(ans);
	}
}
