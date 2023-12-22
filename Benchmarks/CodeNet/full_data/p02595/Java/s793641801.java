import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int point_num = sc.nextInt();
		int dis = sc.nextInt();
		ArrayList<String> ar = new ArrayList<>();
		int ans = 0;
		String v = sc.nextLine();

		int count = 0;
		while(count < point_num) {
			ar.add(sc.nextLine());
			count++;
		}



		for(String b : ar) {
			String bb[] = b.split(" ");
			int x = Integer.parseInt(bb[0]);
			int y = Integer.parseInt(bb[1]);
			double dist = Math.sqrt(x*x + y*y);

			if (dist <= dis) {
				ans++;
			}
		}

		System.out.println(ans);


		}

}
