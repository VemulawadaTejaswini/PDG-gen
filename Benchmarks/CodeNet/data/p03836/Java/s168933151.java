
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		
		
		int distx = tx - sx;
		int disty = ty - sy;
		
		StringBuilder sb = new StringBuilder();
		
		//1回目　s -> t -> s
		for(int i = 0; i < distx; i++) {
			sb.append("R");
		}
		for(int i = 0; i < disty; i++) {
			sb.append("U");
		}
		for(int i = 0; i < distx; i++) {
			sb.append("L");
		}
		for(int i = 0; i < disty; i++) {
			sb.append("D");
		}
		//2回目
		sb.append("D");
		for(int i = 0; i < distx + 1; i++) {
			sb.append("R");
		}
		for(int i = 0; i < disty + 1; i++) {
			sb.append("U");
		}
		sb.append("L");
		sb.append("U");
		for(int i = 0; i < distx + 1; i++) {
			sb.append("L");
		}
		for(int i = 0; i < disty + 1; i++) {
			sb.append("D");
		}
		sb.append("R");
		
		System.out.println(sb.toString());
	}
}

