import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		sc.close();
		
		int numOfPrint = 0;
		for(int i = 0; i < n; i ++) {
			if(numOfPrint != k) {
				System.out.print(s);
				numOfPrint++;
			}else {
				System.out.print(s+1);
			}
			if(i != n - 1) {
				System.out.print(" ");
			}
			System.out.flush();
		}
		System.out.print("\n");
	}
}
