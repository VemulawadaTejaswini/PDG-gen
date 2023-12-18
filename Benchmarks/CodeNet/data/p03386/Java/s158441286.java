import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();

		int sl = A + K ;
		int bl = B - K ;

		for(int i = 0 ; i <= B-A; i++) {
			if(A+i < sl || A+i > bl) {
				System.out.println(A+i);
			}
		}
	}

}
