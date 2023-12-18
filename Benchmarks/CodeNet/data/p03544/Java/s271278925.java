import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int l0 = 2;
		int l1 = 1;
		int ln = 0;

		if(n==1)System.out.println(l1);
		else{
			for(int i=2; i<=n; i++) {
				ln=l1+l0;
				l0=l1;
				l1=ln;
			}
			System.out.println(ln);
		}
	}

}
