
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(true){
			int n = si();
			if(n==0) break;
			boolean f = false;
			long[] sales = new long[4001];
			for (int i = 0; i < n; i++) {
				sales[si()] += (long)si()*si();
			}
			for (int i = 1; i <= 4000; i++) {
				if(sales[i]>=1000000){
					out.println(i);
					f = true;
				}
			}
			if(!f) out.println("NA");
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}