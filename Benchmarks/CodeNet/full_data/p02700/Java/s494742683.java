import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		int l,m;
		if(C%B==0) l=C/B;
		else l=C/B+1;
		
		if(A%D==0) m=A/D;
		else m=A/D+1;
		if (l<=m)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
