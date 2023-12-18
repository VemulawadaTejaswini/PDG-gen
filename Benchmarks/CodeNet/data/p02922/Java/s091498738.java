import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = B%A;
		int D = B/A;
		if(C==0) {
			System.out.println(D);
		}
		else {
			System.out.println(D+1);
			}
	}

}
