import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		String[] U = new String[n];
		for (int x = 0; x < n; x++) {
			U[x] = s.next();
		}

		int m = s.nextInt();
		String[] T = new String[m];
		for (int x = 0; x < m; x++) {
			T[x] = s.next();
		}

		int kagi=0;
		String user;

		for (int j = 0; j < m; j++) {
			user = T[j];
			for (int i = 0; i < n; i++) {
				if (user.equals(U[i])) {
					if (kagi == 0) {
						System.out.println("Opened by " + user);
						kagi = 1;
						user = "";
					} else {
						System.out.println("Closed by " + user);
						kagi = 0;
						user = "";
					}
					break;
				}
			}
			if (!(user.isEmpty()))
				System.out.println("Unknown " + user);
		}

		s.close();
	}
}