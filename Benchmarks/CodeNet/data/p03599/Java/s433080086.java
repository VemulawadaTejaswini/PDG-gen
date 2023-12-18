import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int wt = 1;
		int sg = 0;
		// 水の質量を全探索
		for(int i = 0 ; i <= f ; i++) {
			for(int j = 0 ; j <= f ; j++) {
				if(100 * a * i + 100 * b * j > f) continue;
				int water = 100 * a * i + 100 * b * j;
				// 砂糖の質量を全探索
				for(int k = 0 ; k <= f ; k++) {
					for(int l = 0 ; l <= f ; l++) {
						if(c * k + d * l > f) continue;
						int suger = c * k + d * l;
						if(water + suger > f) continue;
						if(e * water < suger * 100) continue;
						if(sg * water <= suger * wt) {
							wt = water;
							sg = suger;
						}
					}
				}
			}
		}
		int sgwt = sg + wt;
		System.out.println(sgwt + " " + sg);
	}
}