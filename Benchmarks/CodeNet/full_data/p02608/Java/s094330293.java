import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] count = new int[N+1];
		Arrays.fill(count, 0);
		for(int x=1; x<=200; x++) {
			for(int y=1; y<=200; y++) {
				for(int z=1; z<=200; z++) {
					int n = x*x+y*y+z*z+x*y+y*z+z*x;
					if(n <=N) {
						count[n]++;
					}
				}
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		for(int i=1; i<=N; i++) {
			pw.println(count[i]);
		}
		pw.flush();

	}

}
