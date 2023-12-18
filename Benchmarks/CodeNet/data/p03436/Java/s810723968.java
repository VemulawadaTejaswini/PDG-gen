import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int W = s.nextInt();
		char[][] map = new char[H][W];
		int b = 0;
		for(int i = 0;i < H;i++){
			String input = s.next();
			for(int j = 0;j < W;j++){
				map[i][j] = input.charAt(j);
				b += (map[i][j] == '#' ? 1 : 0);
			}
		}
		System.out.println(H*W - H - W - b + 1);
		
	}

}
