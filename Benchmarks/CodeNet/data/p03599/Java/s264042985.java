import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();

		int ans1 = 0 ; int ans2 = 0; // ans1 = water + suger, ans2 = suger
		List<Integer> water = new ArrayList<Integer>();
		List<Integer> suger = new ArrayList<Integer>();
		for(int i = 0 ; i <= F ; i++) {
			for(int j = 0 ; j <= F ; j++) {
				water.add(100 * A * i + 100 * B * j);
			}
		}
		for(int i = 0 ; i <= F ; i++) {
			for(int j = 0 ; j <= F ; j++) {
				suger.add(C * i + D * j);
			}
		}
		for(int i = 0 ; i < water.size() ; i++) {
			for(int j = 0 ; j < suger.size() ; j++) {
				if(suger.get(j) * 100 <= water.get(i) * E) {
					if(water.get(i) + suger.get(j) <= F) {
						if(ans2 * (water.get(i) + suger.get(j)) <= suger.get(j) * (ans1 + ans2)) {
							ans1 = water.get(i) + suger.get(j);
							ans2 = suger.get(j);
						}
					}
				}
			}
		}
		System.out.println(ans1 + " " + ans2);
	}
}