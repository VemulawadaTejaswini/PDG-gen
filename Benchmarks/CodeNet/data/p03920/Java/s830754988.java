import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.nextInt();
		int exclude = 0;
		int i=1;
		int sum = 0;
		for(; i<=N; i++) {
			sum += i;
			if(sum>=N) {
				exclude = sum-N;
				break;
			}
		}
		
		for(int j=1; j<=i; j++)
			if(j!=exclude)
				pw.println(j);
		
		sc.close();
		pw.close();
	}
}
