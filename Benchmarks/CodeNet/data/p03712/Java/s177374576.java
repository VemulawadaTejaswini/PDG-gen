import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String s = sc.next();
		System.out.println();
		for(int i = 0; i < W + 2; i++) {
			System.out.print("#");
		}
		System.out.println();
		for(int i = 0; i < H; i++) {
				System.out.print("#");
				for(int j = 0; j < W; j++) {
					char c = s.charAt(j);
					System.out.print(c);
				}
				System.out.print("#");
				System.out.println();
		}
		for(int i = 0; i < W + 2; i++) {
			System.out.print("#");
		}
	}

}
