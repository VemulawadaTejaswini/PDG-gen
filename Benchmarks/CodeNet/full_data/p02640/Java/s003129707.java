import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner n = new Scanner(System.in);

		int X = n.nextInt();
		int Y = n.nextInt();

		for(int i=1;i<=X;i++) {
			Y -= 2;
		}

		if(Y == 4 || Y == 2 || Y == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
