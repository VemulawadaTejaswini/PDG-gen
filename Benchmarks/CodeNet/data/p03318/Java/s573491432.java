import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int min = 1;
		String app = "9";
		int step = 1;
		int max = 9;
		for (int i = 0; i < k; i++) {
			if (i < 9) {
				System.out.println(i + 1);
			}
			else {
				System.out.println(step + "" + app);
				step++;
				if (step > max) {
					step = 1;
					max += 10;
					app += "9";
				}
			}
			
		}
		/*for (int i = 1; i <= 1000; i++) {
			int t = i;
			int tot = 0;
			while (t > 0) {
				tot += t % 10;
				t /= 10;
			}
			System.out.println(i + ": " + ((float)i / (float)tot));
		}*/
	}

}
