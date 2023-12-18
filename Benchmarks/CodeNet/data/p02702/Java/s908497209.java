import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//int length = (int) (Math.log10(s) + 1);
		int count = 0;
		for (int i = 4; i <=6; i++) {
			for (int j = 0; j < s.length() - i+1; j++) {
				int sub = Integer.parseInt(s.substring(j, j + i));
				if (sub % 2019 == 0 && sub<= 200000) count++;
			}
		}
		System.out.println(count);

	}

}
