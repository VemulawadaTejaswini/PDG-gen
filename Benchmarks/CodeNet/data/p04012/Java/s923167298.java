import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		char[] c = s.toCharArray();
		int count = 0;
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c.length; j ++) {
				if(c[i] == c[j]) {
					count++;
				}
			}
			if(count % 2 != 0) {
				System.out.println("No");
				return;
			}
			count = 0;
		}
		System.out.println("Yes");
	}
}