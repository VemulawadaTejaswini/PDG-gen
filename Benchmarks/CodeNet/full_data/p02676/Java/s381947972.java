import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int k = sc.nextInt();
		String s = sc.next();

		if (k >= s.length()) {
			System.out.println(s);
		} else {
			s = s.substring(0,k);
			System.out.print(s);
			System.out.println("...");
		}

        sc.close();
	}
}