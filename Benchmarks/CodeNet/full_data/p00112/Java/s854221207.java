
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(true){
			int n = si();
			if(n==0) break;
			int[] ary = new int[n];
			for (int i = 0; i < n; i++) {
				ary[i] = si();
			}
			Arrays.sort(ary);
			int sum = 0;
			for (int i = 1; i < n ; i++) {
				int tmp = 0;
				for (int j = 0; j < i ; j++) {
					tmp+=ary[j];
				}
				sum+=tmp;
			}
			out.println(sum);
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}