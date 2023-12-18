import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int n1 = num.nextInt();
		int cnt = 0;

		for(int i = 0; i < n1; i++) {
			int n2 = num.nextInt();
			if(n2 % 2 == 1)
				cnt++;
		}

		if(cnt % 2 == 0 ) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		num.close();
	}
}
