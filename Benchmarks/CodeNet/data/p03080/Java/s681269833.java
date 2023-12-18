import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N  = sc.nextInt();

		String S = sc.next();

		int R = 0;

		int B = 0;

		for(int i=0;i<N;i++) {

			if(S.charAt(i)=='R' ) R++;

			else B++;
		}

		if(R>B) System.out.println("Yes");
		else System.out.println("No");
	}

}
