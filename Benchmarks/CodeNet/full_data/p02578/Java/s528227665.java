import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int old_hight = 0;
		int sum = 0;

		for(int i=0; i<N; i++) {
			int A = sc.nextInt();

			if(i!=0) {
				if(A >= old_hight) {
					old_hight=A;
				}
				else {
					int s = old_hight - A;
					sum = sum + s;
				}
			}
			else {
				old_hight=A;
			}

		}

		sc.close();

		System.out.println(sum);

	}
}
