import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> ins = new ArrayList<String>();
		List<String> outs = new ArrayList<String>();

		int N = sc.nextInt();
		for (int n = 0 ; n < N ; n++) {
			ins.add(sc.next("."));
			outs.add(sc.next("."));
		}

		StringBuilder sb = new StringBuilder();
		int M = sc.nextInt();
		for (int m = 0 ; m < M ; m++) {
			String s = sc.next(".");
			if (ins.contains(s)) {
				sb.append(outs.get(ins.indexOf(s)));
			} else {
				sb.append(s);
			}
		}

		System.out.println(sb.append("\n").toString());

	}
}