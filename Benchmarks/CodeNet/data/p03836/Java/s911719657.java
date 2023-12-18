import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ABC051CSolve solve = new ABC051CSolve();
		solve.main();
	}
}

class ABC051CSolve {
	
	int sx;
	int sy;
	int tx;
	int ty;
	
	ABC051CSolve() {
		Scanner cin = new Scanner(System.in);
		this.sx = cin.nextInt();
		this.sy = cin.nextInt();
		this.tx = cin.nextInt();
		this.ty = cin.nextInt();
	}
	
	void main() {
		StringBuffer sb = new StringBuffer();
		
		int width = tx - sx;
		int height = ty - sy;
		
		// 1st start to goal
		for (int i = 0; i < width; i++) {
			sb.append("R");
		}
		for (int i = 0; i < height; i++) {
			sb.append("U");
		}
		
		// 1st goal to start
		for (int i = 0; i < width; i++) {
			sb.append("L");
		}
		for (int i = 0; i < height; i++) {
			sb.append("D");
		}
		
		// 2nd start to goal
		sb.append("L");
		for (int i = 0; i < height + 1; i++) {
			sb.append("U");
		}
		for (int i = 0; i < width + 1; i++) {
			sb.append("R");
		}
		sb.append("D");
		
		// 2nd goal to start
		sb.append("R");
		for (int i = 0; i < height + 1; i++) {
			sb.append("D");
		}
		for (int i = 0; i < width + 1; i++) {
			sb.append("L");
		}
		sb.append("U");
		
		System.out.println(sb.toString());
	}
	
}