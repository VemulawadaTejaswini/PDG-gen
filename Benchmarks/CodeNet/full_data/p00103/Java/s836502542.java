import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int out_count = 0;
			int hit_count = 0;
			int score = 0;
			while (true) {
				String s = sc.next();
				if (s.equals("OUT")) {out_count++;}
				else if (s.equals("HIT")) {
					if (hit_count==3) {score++;}
					else {hit_count++;}
				}
				else if (s.equals("HOMERUN")) {
					score += hit_count + 1;
					hit_count = 0;
				}
				if (out_count==3) {
					System.out.println(score);
					out_count = 0;
					hit_count = 0;
					score = 0;
				}
			}
		}
	}
}
