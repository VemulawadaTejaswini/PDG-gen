import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);
		int nm1 = sc.nextInt();
		int nm2 = sc.nextInt();
		
		int kane = nm1 * 500;
		
		String str = "Yes";
		
		if (kane < nm2) {
			str = "No";
		}
		
		System.out.println(str);

	}
}