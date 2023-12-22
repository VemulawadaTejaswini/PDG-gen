import java.util.Scanner;

public class Main {
	public static void main(String[] a) {
		final int max = 10;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long ans = 0;
		for (int w = 0; w < max; w++) {
			if(n - w > (max - 1) * 3)continue;
			for (int x = w; x < max; x++) {
				if(n - w - x > (max - 1) * 2)continue;
				for (int y = x; y < max; y++) {
					if(n - w - x - y > (max - 1))continue;
					int z = n - w - x - y;
					if(w == x && x == y && y == z){
						ans +=1;
					}else{
						if((w == x && x == y)||(w == x && x == z)||(w == y && y == z)||(x == y && y == z)){
							ans += 4;
						}else{
							if((w == x && y == z)||(w == y && x == z)||(w == z && y == x)){
								ans += 6;
							}else{
								if((w == x)||(w == y)||(w == z)||(x == y)||(x == z)||(y == z)){
									ans += 12;
								}else{
									ans += 24;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}