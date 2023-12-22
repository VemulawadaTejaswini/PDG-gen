

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < m - 1; i++){
//			if(n % 2 == 0){
//				System.out.println((i + 1)+" "+(n - i));
//			}
//			else {
//				System.out.println((i + 1)+" "+(n - i - 1));
//			}
//			if(n % 2 == 1){


//				System.out.println((n/2 - i) + " "+(n/2 + 1 + i));

				sb.append(((n - 2)/2 - i) + " "+((n - 2)/2 + 1 + i) + "\n");
//			}
//			else {
//				System.out.println((n/2 - i - 1) + " "+(n/2 + 1 + i - 1));
//			}
		}
		sb.append((n - 1) + " "+n+"\n");

		System.out.print(sb);
	}

}
