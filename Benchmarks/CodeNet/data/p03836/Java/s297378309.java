import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt(), sy = sc.nextInt(), tx = sc.nextInt(), ty = sc.nextInt();
		sc.close();
		for (int i = 0; i < Math.abs(sx - tx); ++i) System.out.print("R");
		for (int i = 0; i < Math.abs(sy - ty); ++i) System.out.print("U");
		for (int i = 0; i < Math.abs(sx - tx); ++i) System.out.print("L");
		for (int i = 0; i < Math.abs(sy - ty); ++i) System.out.print("D");
		System.out.print("D");
		for (int i = 0; i < Math.abs(sx - tx) + 1; ++i) System.out.print("R");
		for (int i = 0; i < Math.abs(sy - ty) + 1; ++i) System.out.print("U");
		System.out.print("LU");
		for (int i = 0; i < Math.abs(sx - tx) + 1; ++i) System.out.print("L");
		for (int i = 0; i < Math.abs(sy - ty) + 1; ++i) System.out.print("D");
		System.out.print("R");
	}
}