import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int count = 0;

		while(A>0 && C>0) {
			if(count % 2 == 0) {
				C -= B;
				count += 1;
			}else {
				A -= D;
				count += 1;
				}
			}

		if(A <= 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}

		scan.close();
	}

}
