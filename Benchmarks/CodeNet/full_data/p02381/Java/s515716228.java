import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			if (a == 0) break;
			double sum = 0;
			int[] scores = new int[a];
			for (int i = 0; i < a; i++) {
				scores[i]=sc.nextInt();
				sum+=scores[i];
			}
			double m = sum/a;
			double variance = 0;
			for (int i = 0; i < a; i++) {
				variance += Math.pow(scores[i]-m, 2)/a;
			}
			System.out.println(Math.sqrt(variance));
		}
	}
}
