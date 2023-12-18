import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		executeA();
		executeB();
	}

	private static void executeA() {

		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();
		String[] s1Array = s1.split(" ");

		try {
			int n = Integer.parseInt(s1Array[0]);
			int m = Integer.parseInt(s1Array[1]);

			int count = (n*(n-1) + m*(m-1))/2;
			PrintWriter pw = new PrintWriter(System.out);
			pw.println(count);
			pw.flush();
			pw.close();
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	private static void executeB() {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();

		int result = 1;
		int len = s1.length();
		int halflen = (len-1)/2;

		for(int i=0;i<halflen;i++) {
			if(s1.charAt(i) != s1.charAt(len-1-i)){
				result = -1;
				break;
			}
		}

		if( result == 1) {
			for(int i=0;i<halflen/2;i++) {
				if(s1.charAt(i) != s1.charAt(halflen-1-i)){
					result = -1;
					break;
				}
				if(s1.charAt(halflen+1+i) != s1.charAt(len-1-i)){
					result = -1;
					break;
				}
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		pw.println( result == 1 ? "Yes" : "No" );
		pw.flush();
		pw.close();
	}

}
