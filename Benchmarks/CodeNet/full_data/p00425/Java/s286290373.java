import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		char[] mozi = scan.next().toCharArray();
		for (int i = 0; i < mozi.length; i++) {
			mozi[i]-=3;
			if(mozi[i]<'A') mozi[i]+=26;
			out.print(mozi[i]);
		}
		out.println();

		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}