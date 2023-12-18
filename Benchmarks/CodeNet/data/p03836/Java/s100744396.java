import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt(), sy = sc.nextInt(), tx = sc.nextInt(), ty = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		for(int i = sx;i<tx;i++) {
			sb.append("R");
		}
		for(int i = sy;i<ty;i++) {
			sb.append("U");
		}//1回目のゴール
		sb.append("U");
		for(int i=tx;i>sx;i--) {
			sb.append("L");
		}
		for(int i=ty+1;i>sy;i--) {
			sb.append("D");
		} 
		sb.append("R");//戻ってきた

		for(int i = sy;i<ty;i++) {
			sb.append("U");
		}
		for(int i = sx;i<tx;i++) {
			sb.append("R");
		}//2回目のゴール
		
		sb.append("R");
		for(int i=ty;i>sy;i--) {
			sb.append("D");
		}
		sb.append("D");
		for(int i=tx+1;i>sx;i--) {
			sb.append("L");
		}
		sb.append("U");
		
		
		System.out.println(sb.toString());
		
	}
}

