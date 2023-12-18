
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sx, sy, tx, ty;
		int dx, dy;
		
		String ans = "";
		
		sx = sc.nextInt();
		sy = sc.nextInt();
		tx = sc.nextInt();
		ty = sc.nextInt();
		
		sc.close();
		
		
		dx = tx - sx;
		dy = ty - sy;
		
		for(int j = 0; j < 2; ++j) {
			for(int i = 0; i < dy; ++i)ans += 'U';
			for(int i = 0; i < dx; ++i)ans += 'R';
			if(j == 1) {
				ans += 'D';
				ans += 'R';
			}
			for(int i = 0; i < dy; ++i)ans += 'D';
			for(int i = 0; i < dx; ++i)ans += 'L';
			if(j == 0) {
				ans += 'L';
				++dx;
				++dy;
			}
			else {
				ans += 'U';
			}
		}
		
		System.out.println(ans);
	}

}
