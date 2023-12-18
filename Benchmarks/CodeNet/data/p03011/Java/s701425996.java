import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();

		int tmp = Math.min(p+q, p+r);
		int answer = Math.min(tmp, q+p);
		System.out.println(answer);

	}

}