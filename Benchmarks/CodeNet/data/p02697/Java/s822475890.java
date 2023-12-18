

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		for(int i = 0; i < m; i++){
//			if(n % 2 == 0){
//				System.out.println((i + 1)+" "+(n - i));
//			}
//			else {
//				System.out.println((i + 1)+" "+(n - i - 1));
//			}
			if(n % 2 == 1){
				System.out.println((n/2 - i) + " "+(n/2 + 1 + i));
			}
			else {
				System.out.println((n/2 - i - 1) + " "+(n/2 + 1 + i - 1));
			}
		}
	}

}
