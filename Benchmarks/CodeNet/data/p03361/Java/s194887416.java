import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[][] campus = new String[H][W];
		for (int i=0;i < H;i++) {
			String input = sc.next();
			for (int j=0;j < W;j++) {
				campus[i][j] = input.substring(j,j+1);
			}
		}
		
		String ans = "Yes";
		outside: for (int i=0;i < H;i++) {
			for (int j=0;j < W;j++) {
				if (campus[i][j].equals("#")) {
					if ((j != 0) && (campus[i][j-1].equals("#"))) {
						break;
					} else if ((j != W-1) && (campus[i][j+1].equals("#"))) {
						break;
					} else if ((i != 0) && (campus[i-1][j].equals("#"))) {
						break;
					} else if ((i != H-1) && (campus[i+1][j].equals("#"))) {
						break;
					} else {
						ans = "No";
						break outside;	
					}
				}
			}
		}
		System.out.println(ans);
	}
}
