import java.io.PrintWriter;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		int w = tx - sx;
		int h = ty - sy;
		int[] c = {h,w,h,w,1,h+1,w+1,1,1,h+1,w+1,1};
		String[] s = {"U","R","D","L","L","U","R","D","R","D","L","U"};
		for(int i=0;i<12;i++) {
			for(int j=0;j<c[i];j++) {
				out.print(s[i]);
			}
		}
		out.flush();
	}

}