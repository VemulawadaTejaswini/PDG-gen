import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FastScanner fc = new FastScanner();
		int num = fc.nextInt();
		int q =fc.nextInt();
		String str = sc.next();
		String subStr = "";
		for (int k = 0; k < q; k++) {
			subStr = str.substring(sc.nextInt() - 1, sc.nextInt());
			System.out.println((subStr.length() - subStr.replaceAll("AC", "").length()) / 2);
			System.gc();
		}
	}


}
