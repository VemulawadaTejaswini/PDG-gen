import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H == 0 && W == 0) {
				break;
			}
			for(int i = 0; i < H; ++i) {
				for(int j = 0; j < W; ++j) {
					System.out.print((i == 0 || i == H - 1 || j == 0 || j == W - 1 ? "#" : "."));
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
