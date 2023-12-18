
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sx, sy, tx, ty;
		int dx, dy;
		
		StringBuilder ans = new StringBuilder();
		
		sx = sc.nextInt();
		sy = sc.nextInt();
		tx = sc.nextInt();
		ty = sc.nextInt();
		
		sc.close();
		
		
		dx = tx - sx;
		dy = ty - sy;
		
		for(int j = 0; j < 2; ++j) {
			for(int i = 0; i < dy; ++i)ans.append('U');
			for(int i = 0; i < dx; ++i)ans.append('R');
			if(j == 1) {
				ans.append('D');
				ans.append('R');
			}
			for(int i = 0; i < dy; ++i)ans.append('D');
			for(int i = 0; i < dx; ++i)ans.append('L');
			if(j == 0) {
				ans.append('L');
				++dx;
				++dy;
			}
			else {
				ans.append('U');
			}
		}
		
		String ans2 = new String(ans);
		
		System.out.println(ans2);
	}

}
