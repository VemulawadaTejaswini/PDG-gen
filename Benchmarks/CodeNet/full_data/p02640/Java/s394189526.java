import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int leg = 0;
		String ans = "";

		for (int t=0; t<X+1; t++) {
			for (int k=0; k<X+1-t; k++) {
				leg = 2*t + 4*k;
				if (leg==Y) {
					ans = "Yes";
				}
			}
		}
		if (ans=="Yes") {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}

}
