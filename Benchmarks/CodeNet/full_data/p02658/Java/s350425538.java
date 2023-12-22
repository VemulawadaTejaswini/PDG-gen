import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int A[] = new int[N];
		int ans = 1;
		double n = 10^18;
		
		for(int i=0;i<N;i++) {
			A[i] = scan.nextInt();
			ans = ans * A[i];
		}
		if(ans<n) {
			ans = -1;
		}
		System.out.println(ans);
	}
}
