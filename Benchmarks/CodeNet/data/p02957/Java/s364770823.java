import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = (A+B)/2;


		if(Math.ceil(K)!=Math.floor(K)) {
			System.out.println(K);
		}else {
			System.out.println("IMPOSSIBLE");
		}
	}

}
