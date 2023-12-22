import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int num = Integer.parseInt(line);

		StringBuilder ans = new StringBuilder();

		for (int i = 3; i <= num; i++) {
			int x = 3;
			if (x % 3 == 0 || x % 10 == 3 || x / 10 % 10 == 3) {
				ans.append(" " + i);
				x ++;
			} 
		}

		String d = ans.toString();
		System.out.println(d);
	}


}

