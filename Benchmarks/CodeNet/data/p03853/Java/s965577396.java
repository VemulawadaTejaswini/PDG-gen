import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		boolean[][] C = new boolean[W][H];
		for(int y = 0;y < H;++y) {
			String str = sc.next();
			for(int x = 0;x < W;++x) {
				C[x][y] = str.charAt(x) == '.';
			}
		}
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		for(int y = 0;y < 2*H;++y) {
			int y2 = y/2;
			for(int x = 0;x < W;++x) {
				if(C[x][y2])
					sb.append(".");
				else
					sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
