import java.util.Scanner;

public class Main {// AtCoderは必ずMainクラスで提出する
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if(n < k) {
			System.out.println("1");
			return;
		}
		int amari = n%k;
		System.out.println(amari);
	}
}