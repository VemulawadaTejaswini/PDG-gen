import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] line = reader.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int A = Integer.parseInt(line[1]);
		int B = Integer.parseInt(line[2]);
		int C = Integer.parseInt(line[3]);
		int D = Integer.parseInt(line[4]);
		String[] s = reader.readLine().split("");
		boolean sharp2flag = false;
		boolean ten3flag = false;
		boolean gyakuflag = false;
		for (int i = 0; i < N-1; i++) {
			if (s[i].equals("#") && s[i+1].equals("#")) {
				sharp2flag = true;
			}
			if (i < N-2 && s[i].equals(".") && s[i+1].equals(".") && s[i+2].equals(".")) {
				ten3flag = true;
			}
		}
		if (Math.max(A, B) == A && Math.max(C, D) == D) {
			gyakuflag = true;
		}
		else if (Math.max(A, B) == B && Math.max(C, D) == C) {
			gyakuflag = true;
		}
		
		if (sharp2flag) {
			System.out.println("No");
		}
		else if (A == B || C == D) {
			System.out.println("No");
		}
		else if (gyakuflag && ten3flag) {
			System.out.println("Yes");
		}
		else if (!gyakuflag && ten3flag) {
			System.out.println("Yes");
		}
		else if (gyakuflag && !ten3flag) {
			System.out.println("No");
		}
		else if (!gyakuflag && !ten3flag) {
			System.out.println("Yes");
		}
	}
}