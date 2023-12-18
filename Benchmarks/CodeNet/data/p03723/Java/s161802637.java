import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int ans=0;

		if(A==B&&B==C){
			ans = -1;
		}else{

			while(A%2==0&&B%2==0&&C%2==0){
				int a = A;
				int b = B;
				int c = C;
				A=(b+c)/2;
				B=(a+c)/2;
				C=(a+b)/2;
				ans++;
			}


		}

		System.out.println(ans);


	}

}
