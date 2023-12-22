import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		// 1オリジン
		int[]A = new int[H + 1];
		for(int i = 0; i < H; i++) {
			A[i + 1] = scan.nextInt();
		}
		scan.close();
		for(int i = 1; i <= H; i++) {
			System.out.print("node " + i + ": key = " + A[i] + ", ");
			if(parent(i) >= 1) {
				System.out.print("parent key = " + A[parent(i)] + ", ");
			}
			if(left(i) <= H) {
				System.out.print("left key = " + A[left(i)] + ", ");
			}
			if(right(i) <= H) {
				System.out.print("right key = " + A[right(i)] + ", ");
			}
			System.out.println();
		}
	}
	static int parent(int i) {return i / 2;}
	static int left(int i) {return 2 * i;}
	static int right(int i) {return 2 * i + 1;}
}
