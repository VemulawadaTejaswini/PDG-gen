import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int judge = 1;

		for(int i=0; i<B; i++) {
			judge *= (i*A) % B - C;
		}
		if(judge == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
