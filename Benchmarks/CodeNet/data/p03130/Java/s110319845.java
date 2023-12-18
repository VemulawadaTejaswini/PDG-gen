import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;

		for(int i = 0; i < 6; i++) {
			int c = sc.nextInt();
			if(c == 1) {
				one++;
			} else if(c==2) {
				two++;
			} else if(c==3) {
				three++;
			} else {
				four++;
			}
		}

		int oddCount = 0;

		if(one%2==1) {
			oddCount++;
		}
		if(two%2==1) {
			oddCount++;

		}
		if(three%2==1) {

			oddCount++;
		}
		if(four%2==1) {
			oddCount++;

		}

		if(oddCount == 0 || oddCount ==2) {
			System.out.println("YES");
			return;
		}

		System.out.println("NO");

	}

}
