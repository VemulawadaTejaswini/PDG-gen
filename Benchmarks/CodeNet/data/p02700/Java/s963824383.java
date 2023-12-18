import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A_hp = sc.nextInt();
		int A_atk =sc.nextInt();
		int B_hp = sc.nextInt();
		int B_atk =sc.nextInt();
		
		for(;;) {
			B_hp -= A_atk;
			if(B_hp <= 0) {
				System.out.println("Yes");
				return;
			}
			A_hp -= B_atk;
			if(A_hp <= 0) {
				System.out.println("No");
				return;
			}

		}

	}

}
