import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = Integer.parseInt(stdin.next());
		long A[] = new long[N+1];
		long sum=0;
		long ans=0;
		
		for(int i=0;i<N;i++) {
			A[i] = stdin.nextLong();
		}
		
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				sum+=A[i]^A[j];
			}
		}
		
		ans = sum % ((10*10*10*10*10*10*10*10*10)+7);
		
		out.println(sum);
		out.println(ans);
		
		out.flush();
	}

}
