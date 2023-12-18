import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();

		boolean ansflg=false;
		if(A>B) {
			if(A>=C && B<=C) ansflg=true;
		}else {
			if(B>=C && A<=C) ansflg=true;
		}

		if(ansflg) System.out.println("Yes");
		else System.out.println("No");

		sc.close();
	}

}
