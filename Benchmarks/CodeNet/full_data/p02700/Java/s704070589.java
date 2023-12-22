
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int count=2;

		while(A >= 0 || C >= 0) {
			if(count % 2 == 0) {
				C -= B;
				count++;
			}else{
				A -= D;
				count++;
			}
		}

		if(count % 2 == 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}

		sc.close();

	}

}
