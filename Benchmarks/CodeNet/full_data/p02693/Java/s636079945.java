import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = 0;

		while(k*i < b) {
			if(k * i >= a && k * i <= b) {
				System.out.println("OK");
				return;
			}
			i++;
		}
		System.out.println("NG");
	}

}
