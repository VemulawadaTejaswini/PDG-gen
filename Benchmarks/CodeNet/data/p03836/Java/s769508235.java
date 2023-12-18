import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int sx,sy,tx,ty;
		Scanner sc = new Scanner(System.in);
		sx = sc.nextInt();
		sy = sc.nextInt();
		tx = sc.nextInt();
		ty = sc.nextInt();

		a(sx, tx, "R");
		a(sy, ty, "U");
		a(sx, tx, "L");
		a(sy, ty, "D");
		System.out.print("D");
		a(sx, tx+1, "R");
		a(sy, ty+1, "U");
		System.out.print("L");
		System.out.print("U");
		a(sx, tx+1, "L");
		a(sy, ty+1, "D");
		System.out.print("R");

		sc.close();
	}


	public static void a(int sa, int ta, String s) {
		int d = Math.abs( ta - sa );
		for(int i = 0; i < d; i++) {
			System.out.print(s);
		}
	}
}
