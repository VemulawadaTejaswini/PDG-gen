import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		//距離範囲
		int A = sc.nextInt();
		int B = sc.nextInt();

		int B1 = B / K;
		int anser =0;
		for(int  i =1; i < B1; i++ ) {
			 anser = K*i;
		}
		if(A<= anser && anser<=B) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
}
}