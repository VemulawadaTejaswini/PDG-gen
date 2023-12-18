import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int ac = B / (A - 1); // 最低限必要な電源タップの数
		int d = B % (A - 1); // 足りない個口数
		if(d > 0) d = d - 1; // 未使用個口数を減算
		System.out.println(ac + d);
	}
}
