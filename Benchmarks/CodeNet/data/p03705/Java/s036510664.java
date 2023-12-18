import java.util.Scanner;
 
public class Main {
	static Scanner in = new Scanner(System.in);
 
	public static void main(String[] args) {
		int N = in.nextInt(), A = in.nextInt(), B = in.nextInt();
 
		if (A > B || (N == 1 && A != B)) {
			System.out.println("0");
		} else if (A == B && N == 1) {
			System.out.println("1");
		} else {
			long min = (long)A * (N - 2);
			long max = (long)B * (N - 2);
			System.out.println(max - min + 1);
		}
 
	}
}