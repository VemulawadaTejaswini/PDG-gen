import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int nC2 = 1;
		for(int i = n; i>n-2; i--){
			nC2 *= i;
		}
		nC2 /= 2;
		if(n < 2){
			nC2 = 0;
		}

		int mC2 = 1;
		for(int i = m; i>m-2; i--){
			mC2 *= i;
		}
		mC2 /= 2;
		if(m < 2){
			mC2 = 0;
		}
		System.out.println(nC2+mC2);

	}


}
