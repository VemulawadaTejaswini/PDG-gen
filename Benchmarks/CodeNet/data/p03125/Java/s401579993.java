import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		long D;
		D = sc.nextInt();
		long[] A=new long[N];
//		long sum=0;
		long ans=D%N;


/*		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			sum=sum+A[i];
			if(max<A[i]) {
				max2=max;
				maxno2=maxno;
				max=A[i];
				maxno=i;
			}
		}
		*/

			
				if(ans>0) {
					System.out.print(D-N); 	
				}else {
					System.out.print(D+N); 	
						
				}
	}
}


