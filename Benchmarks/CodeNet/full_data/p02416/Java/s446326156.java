import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while (sc.hasNext()) {
			String str = sc.next();
			int number = Integer.parseInt(str);
			if (number == 0) break;
			int sum = 0;
			for (int i=0; i < str.length(); i++) {
				num = Integer.parseInt(str.substring(i, i+1));
				sum = sum + num;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}