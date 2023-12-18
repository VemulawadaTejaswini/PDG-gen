import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sx = scan.nextInt();
		int sy = scan.nextInt();
		int tx = scan.nextInt();
		int ty = scan.nextInt();
        int up = ty - sy;
        int right = tx - sx;
		for(int i= 0;i<up;i++) {
			System.out.print("U");
		}
		for(int i= 0;i<right;i++) {
			System.out.print("R");
		}
		for(int i= 0;i<up;i++) {
			System.out.print("D");
		}
		for(int i= 0;i<right;i++) {
			System.out.print("L");
		}
		System.out.print("L");
		for(int i= 0;i<up+1;i++) {
			System.out.print("U");
		}
		for(int i= 0;i<right+1;i++) {
			System.out.print("R");
		}
		System.out.print("D");
		System.out.print("R");
		for(int i= 0;i<up+1;i++) {
			System.out.print("D");
		}
		for(int i= 0;i<right+1;i++) {
			System.out.print("L");
		}
		System.out.print("U");
	}

}
