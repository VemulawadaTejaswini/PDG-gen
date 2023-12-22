import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int n = Integer.valueOf(sc.nextLine());
			int[] ans = new int[4];

			for (int i =0; i < n; i++) {
				String line = sc.nextLine();

				if (line.equals("AC")) {
					ans[0]++;
				} else if (line.equals("WA")) {
					ans[1]++;
				} else if (line.equals("TLE")) {
					ans[2]++;
				} else if (line.equals("RE")) {
					ans[3]++;
				}
 			}

			System.out.println("AC x " + ans[0]);
			System.out.println("WA x " + ans[1]);
			System.out.println("TLE x " + ans[2]);
			System.out.println("RE x " + ans[3]);


		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
