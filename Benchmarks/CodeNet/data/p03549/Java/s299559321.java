import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		sc.close();

		//全問正解できる確率
		// (1/2)^M (=pとする）
		
		//1回の実行時間
		//(N-M)*100 + M*1900
		
		//確率pを成功するまで試行する回数の期待値は1/p
		
		out.println( (int)( ((N-M)*100 + M*1900) * Math.pow(2, M)));
		
		
		
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
	
	@SuppressWarnings("unused")
	private String join(String delimiter, int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}
	
	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
