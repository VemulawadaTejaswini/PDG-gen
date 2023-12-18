import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[]C = new String[H];
		for(int i = 0; i < H; i++) {
			C[i] = sc.next();
		}
		sc.close();
		for(int i = 0; i < H; i++) {
			if(C[i].length() == W) {
				System.out.println(C[i]);
				System.out.println(C[i]);
			}
		}
	}
}