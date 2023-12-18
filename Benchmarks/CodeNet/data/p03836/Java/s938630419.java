import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt(), sy = sc.nextInt(), tx = sc.nextInt(), ty = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		for(int i = sx;i<tx;i++) {
			sb.append("R");
		}
		for(int i = sy;i<=ty;i++) {
			sb.append("U");
		}//1回目のゴール+上に1つ
		for(int i=tx;i>sx;i--) {
			sb.append("L");
		}
		for(int i=ty+1;i>=sy;i--) {
			sb.append("D");
		} //1回目の戻ってきて、下に1つ

		for(int i = sx;i<=tx;i++) {
			sb.append("R");
		} //r右にはみでる

		for(int i = sy-1;i<ty;i++) {
			sb.append("U");
		}//2回目のゴール
		
		for(int i=tx+1;i>=sx;i--) {
			sb.append("L");
		}

		for(int i=ty;i>sy;i--) {
			sb.append("D");
		}

		sb.append("R");
		
		
		System.out.println(sb.toString());
		
	}
}

