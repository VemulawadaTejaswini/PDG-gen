import java.util.*;







public class Main{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long[] A = new long[N];
		long[] B = new long[N];
		for(int i=0;i<N;i++) {

			A[i] = in.nextLong();
			B[i] = A[i];

		}
		for(int i=0;i<N-1;i++) {
			if(A[i]>A[i+1]) {
				A[i]--;
			}
		}
		
		Arrays.sort(B);
		int flag=0;
		for(int i=0;i<N;i++) {
			if(A[i]!=B[i]) {
				flag=1;
				break;
			}
			
		}
		if(flag==1) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}

	}

}