package AtCorder過去問;

import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(B % A == 0) 
			System.out.println(A + B);
		else
			System.out.println(B - A);
		

	}


}
