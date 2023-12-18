import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;

		for(int i = 0;i < s.length() - 1;i++) {
			for(int j = i + 4;j <= s.length();j++) {
				long n = Long.parseLong(s.substring(i, j));
				//System.out.println(i + " " + j + " " + n);
				if(n % 2019 == 0) {
					//System.out.println(n);
					count++;
				}

			}
		}

		System.out.println(count);
    }
}