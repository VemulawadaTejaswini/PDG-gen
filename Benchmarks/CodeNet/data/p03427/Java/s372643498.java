import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(Integer.parseInt(String.valueOf(N).substring(0, 1)) - 1 + (String.valueOf(N).length() - 1) * 9);
	}
}
