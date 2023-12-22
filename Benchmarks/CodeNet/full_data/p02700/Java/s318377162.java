import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t_HP = Integer.parseInt(sc.next());
		int t_atk = Integer.parseInt(sc.next());
		int a_HP = Integer.parseInt(sc.next());
		int a_atk = Integer.parseInt(sc.next());

		while (true) {
			a_HP -= t_atk;
			if (a_HP <= 0) {
				System.out.println("Yes");
				break;
			}

			t_HP -= a_atk;
			if (t_HP <= 0) {
				System.out.println("No");
				break;
			}
		}
	}

}
