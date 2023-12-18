import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();

		int A = sc.nextInt();
		int B = sc.nextInt();

		int i;
		boolean flag = false;
		for(i = A; i<= B;i++) {
			if(i%K ==0) {
				flag = true;
				break;
			}
		}

		if(flag == true) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}

		System.out.println();
	}

}