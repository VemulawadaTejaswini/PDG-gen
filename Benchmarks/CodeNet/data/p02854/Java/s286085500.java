
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for(int i=0;i<N;i++)A[i]=sc.nextLong();
		sc.close();
		
		
		long sum = 0;
		for(int i=0;i<N;i++) {
			sum += A[i];
		}
		
		long half = (sum+1)/2; //切り上げ
		
		long tmpsum = 0;
		int j=0;
		while(tmpsum<half) {
			tmpsum += A[j];
			j++;
		}
		
		if(tmpsum == sum) {
			tmpsum = A[N-1];
		}
		
		long ans = tmpsum*2-sum;
		
		System.out.println(ans);
		
	}

}
