import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		int A1[] = new int[N];
		int A2[] = new int[N];
		
		int a1 = 0;
		for(int n1=0; n1<N; n1++) {
			a1 += keyboard.nextInt();
			A1[n1] = a1;
		}
		
		int a2sum = 0;
		for(int n2=0; n2<N; n2++) {
			A2[n2] = keyboard.nextInt();
			a2sum += A2[n2];
		}
		int ans = a2sum+A1[0];
		
		for(int n=1; n<N; n++) {
			a2sum -= A2[n-1];
			if(ans < A1[n]+ a2sum) {
				ans = A1[n]+ a2sum;
			}
		}
		
		System.out.println(ans);
		keyboard.close();
	}
}
