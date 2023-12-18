import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] input = sc.nextLine().toCharArray();
		int count = 0;
		String tmp = "";
		String before = "";
		for (char c : input) {
			tmp = tmp + c;
			if (!tmp.equals(before)) {
				count++;
				before = tmp;
				tmp = "";
			}
		}
		System.out.println(count);
	}
}
