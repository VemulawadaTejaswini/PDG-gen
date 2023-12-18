import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		String aw = "";
		for (int i = 0; i < b; i++) {
			aw += String.valueOf(a);
		}
		String bw = "";
		for (int i = 0; i < a; i++) {
			bw += String.valueOf(b);
		}
		if (aw.compareTo(bw) >= 0) {
			System.out.println(bw);
		} else {
			System.out.println(aw);
		}
	}
}
