import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		while(N>10) {
			N=N-10;
		}
		System.out.println(N);
		if(N == 3) {
			System.out.println("bon");
		}else if(N == 0 ||N == 1 || N == 6 || N == 8) {
			System.out.println("pon");
		}else {
			System.out.println("hon");
		}
	}

}
