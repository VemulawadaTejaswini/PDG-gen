import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		System.out.println(sArray.toString().compareTo(tArray.toString()) < 0 ? "Yes" : "No");
		sc.close();
	}
}