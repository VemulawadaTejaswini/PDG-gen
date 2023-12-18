import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int count = 0;
		count = B / A;
		
		if(C < count) {
			System.out.println(C);
		}else {
			System.out.println(count);
		}
	}

}
