import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int judge = 0;

		for(int i=0; i<B; i++) {
			if((i*A)%B != C) {
				judge += 0;
			}else {
				judge += 1;
			}
		}

		if(judge == 0) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}


	}

}
