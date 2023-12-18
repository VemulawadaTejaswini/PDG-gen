import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		int R = scan.nextInt();

		int A = 2019;
		int  j = R;
		for(int i = L; i-1 < j; i++) {
			for(j = L+1; j <R; j++) {
				int n =i*j;
				if(A > n%2019) {
					A = n%2019;
				}
			}
		}
		System.out.println(A);
	}

}