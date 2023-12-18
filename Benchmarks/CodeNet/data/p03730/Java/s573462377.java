import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		sc.close();

		int rest = A % B;
		boolean check = false;
		for(int i = 1; i <= B; i++) {
			int tmp = rest * i;
			if(tmp % B == C) {
				check = true;
				break;
			}else {
				continue;
			}
		}
		if(check) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
