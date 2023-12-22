import java.util.Scanner;

public class Main { // クラス名はMain
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int i = 1;
		while (i < 10000) {
			if (x == 0) {
				break;
			}else{
			i++;
			System.out.println("Case " + i + ": " + x);
}

		}
	}

}
