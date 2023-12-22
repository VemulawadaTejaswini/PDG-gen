import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			n--;
			char[] snake = sc.next().toCharArray();
			String ans = isSnakeA(snake) ? "A" : isSnakeB(snake) ? "B" : "NA";
			System.out.println(ans);
		}
	}

	private static boolean isSnakeA(char[] snake) {
		String sa = "^>'(=+)#\\1~$";
		Pattern pa = Pattern.compile(sa);
		Matcher ma = pa.matcher(String.valueOf(snake));
		return ma.find();
	}

	private static boolean isSnakeB(char[] snake) {
		String sb = "^>\\^(Q=)+~~$";
		Pattern pb = Pattern.compile(sb);
		Matcher mb = pb.matcher(String.valueOf(snake));
		return mb.find();
	}
}