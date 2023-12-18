import java.io.PrintStream;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final int N = sc.nextInt();
		final int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i=0;i<N;i++) {
			map.put(A[i], i+1);
		}
		StringBuilder sb = new StringBuilder();
		for(Integer i : map.values()) {
			sb.append(i).append(" ");
		}
		sb.setLength(sb.length()-1);
		out.println(sb.toString());
	}

}
