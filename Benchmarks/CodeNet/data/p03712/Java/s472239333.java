import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int i;
		String[] str = new String[H];
		for(i = 0;i < H;i ++) {
			str[i] = sc.next();
		}
		for(i = 0;i < W + 2;i ++) {
			System.out.print("#");
		}
		System.out.println("");
		for(i = 0;i < H;i ++) {
			System.out.println("#" + str[i] + "#");
		}
		for(i = 0;i < W + 2;i ++) {
			System.out.print("#");
		}
		System.out.println("");
	}
}