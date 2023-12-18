import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		sc.close();

		if(K <= A){
			System.out.println(K);
		}else if(A+B >= K){
			System.out.println(A);
		}else if(A+B+C >= K) {
			System.out.println(A - (K-A-B));
		}

	}

}
