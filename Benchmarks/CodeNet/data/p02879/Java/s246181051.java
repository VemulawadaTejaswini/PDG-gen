import java.util.*;

public class Main {

	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int A, B;

		System.out.println("Enter two number for variable A and B");

		A= sc.nextInt();
		B= sc.nextInt();
		int c= A*B;

		if(A<=9 && A>=1 && B<=9 && B>=1){

			System.out.println("\n\n"+c);

		}else {

			System.out.println(c);
			System.out.println("\n\n"+A+ "x" +B+ "=" +c+ ",but Takahashi cannot do this calculation, so print -1 instead.");

		}

	}

}