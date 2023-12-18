import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int mod = (A-C)%B;
		int i=2;
		int mod_i = -1;
		while(mod != mod_i) {
			mod_i = (A*i - C)%B;
			if(mod_i == 0) {
				System.out.println("YES");
				return;
			}else {
				i++;
			}
		}
		System.out.println("NO");
	}

}
