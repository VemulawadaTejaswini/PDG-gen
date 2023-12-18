import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int seven = 0;

		String[] list = S.split("", 0);

		for (String num : list) {
			if(num.equals("7")) {
				seven++;
			}
		}
		if(seven == 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}
