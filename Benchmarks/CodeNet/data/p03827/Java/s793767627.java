import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		char[] c = s.toCharArray();

		int max = 0;
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (c[i] == 'I') cnt++;
			if (c[i] == 'D') cnt--;
			if (max < cnt) max = cnt;
		}

		System.out.println(max);

		sc.close();
	}

}
