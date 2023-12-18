import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		String num = Long.toString(N);
		long t = 0;
		for(int i = 0; i < num.length(); i++) {
			t += Long.parseLong(num.substring(i, i + 1));
		}
		if(N % t == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}