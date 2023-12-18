import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		sc.close();
		System.out.println(
				firstst(sx, sy, tx,ty)
				+ firstts(sx, sy, tx,ty)
				+ secondst(sx, sy, tx, ty)
				+ secondts(sx, sy, tx, ty));

	}
	
	private static String firstst(int sx, int sy, int tx, int ty){
		return repeat('U', ty - sy) + repeat('R', tx - sx);
	}
	
	private static String firstts(int sx, int sy, int tx, int ty){
		return repeat('D', ty - sy)+ repeat('L', tx - sx);
	}
	
	private static String secondst(int sx, int sy, int tx, int ty){
		return "L" + firstst(sx - 1, sy, tx, ty + 1) + "D";
	}
	
	private static String secondts(int sx, int sy, int tx, int ty){
		return "R" + firstts(sx, sy -1, tx + 1, ty) + "U";
	}
	
	private static String repeat(char c, int n){
		char[] chars = new char[n];
		Arrays.fill(chars, c);
		return new String(chars);
	}

}
