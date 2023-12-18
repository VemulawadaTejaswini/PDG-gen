import java.util.Scanner;

public class Main{


	static int n;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = Integer.parseInt(scanner.next());

		System.out.println(defs("0"));
	}

	public static int defs(String s) {

		int count = 0;
		if(Long.parseLong(s) > n) {
			return 0;
		}

		if(s.contains("7") && s.contains("5") && s.contains("3")) {
			count = 1;
		}

		count += defs(s + "3");
		count += defs(s + "7");
		count += defs(s + "5");




		return count;
	}

}