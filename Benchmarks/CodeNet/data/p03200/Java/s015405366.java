import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] N = sc.next().split("");
		long res = 0;
		long num = 0;
		for (String s : input) {
			if (s.equals("W")) {
				res += num;
			} else {
				num++;
			}
		}
		System.out.println(res);

	}
}
