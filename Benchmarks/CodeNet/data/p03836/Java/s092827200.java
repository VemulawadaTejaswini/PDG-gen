import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		int dx = tx - sx;
		int dy = ty - sy;
		String ans = "";
		for(int i = 0  ; i < dx ; i++) {
			ans += "R";
		}
		for(int i = 0 ; i < dy ; i++) {
			ans += "U";
		}
		for(int i = 0 ; i < dx ; i++) {
			ans += "L";
		}
		for(int i = 0 ; i < dy ; i++) {
			ans += "D";
		}
		ans += "D";
		for(int i = 0 ; i < dx + 1; i++) {
			ans += "R";
		}
		for(int i = 0 ; i < dy + 1 ; i++) {
			ans += "U";
		}
		ans += "L";
		ans += "U";
		for(int i = 0 ; i < dx + 1 ; i++) {
			ans += "L";
		}
		for(int i = 0 ; i < dy + 1; i++) {
			ans += "D";
		}
		ans += "R";
		System.out.println(ans);
	}
}
