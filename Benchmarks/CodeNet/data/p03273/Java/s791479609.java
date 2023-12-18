import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//Scanner sc2 = new Scanner(System.in);
		final int H = sc.nextInt();
		final int W = sc.nextInt();
		String[] str = new String[H];
		for(int i = 0; i < H; i++) {
			str[i] = sc.next();
		}
		
		boolean[] col = new boolean[H];
		Arrays.fill(col, false);
		boolean[] row = new boolean[W];
		Arrays.fill(row, false);
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(str[i].charAt(j) == '#') {
					col[i] = true;
					row[j] = true;
				}
			}
		}
		
		for(int i = 0; i < H; i++) {
			if(row[i]) {
				for(int j = 0; j < W; j++) {
					if(col[j]) {
						System.out.print(str[i].charAt(j));
					}
				}
				System.out.println("");
			}
		}
	}
}
