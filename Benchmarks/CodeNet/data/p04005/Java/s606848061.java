
import java.util.Scanner;



class Main {

	public static void main(String[] argv){

		Scanner sc = new Scanner(System.in);
		int A,B,C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		sc.close();
		
		int cutA = (A % 2) * B * C;
		int cutB = (B % 2) * A * C;
		int cutC = (C % 2) * A * B;
		
		System.out.println(Math.min(cutA, Math.min(cutB,cutC)));
		

	}


}

