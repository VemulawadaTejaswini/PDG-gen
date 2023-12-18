import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String code_st =scan.next();
		int[] code = new int[4];
		code[0] = Integer.parseInt(code_st.substring(0, 1));
		for (int i = 1; i < 4; i++) {
			code[i] = Integer.parseInt(code_st.substring(i, i + 1));
			if (code[i - 1] == code[i]) {
				System.out.println("Bad");
				return;
			}
		}
		System.out.println("Good");
		return;
	}
}
