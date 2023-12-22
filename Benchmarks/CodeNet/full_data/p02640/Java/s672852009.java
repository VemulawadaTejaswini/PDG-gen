import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner n = new Scanner(System.in);

		int X = n.nextInt();
		int Y = n.nextInt();
		boolean tag = false;

		for(int i=1;i<=X;i++) {
			Y -= 2;
			if(Y == 4 || Y == 2 || Y == 0) {
				tag = true;
				break;
			}
		}
		if(tag == true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
