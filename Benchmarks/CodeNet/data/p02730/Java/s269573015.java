import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int b = s.length();
		int t = 0;
		char a[] = s.toCharArray();
		if (b % 2 == 0)
			System.out.println("NO");
		else {
			for (int i = 0; i < b / 2; i++) {
				if (a[i] == a[b - i - 1])
					t++;
				else
					break;
			}
			if (t == b / 2 && t >= 3 && t <= 99)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
