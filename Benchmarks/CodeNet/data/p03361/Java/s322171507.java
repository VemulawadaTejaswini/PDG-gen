import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	boolean canDraw = true;

	public static void main(String[] args) throws IOException {
		Main m = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] get = br.readLine().split(" ");
		int H = Integer.parseInt(get[0]);
		int W = Integer.parseInt(get[1]);

		String[][] field = new String[H][W];

		for (int h = 0; h < H; h++) {
			get = br.readLine().split("");
			for (int w = 0; w < W; w++) {
				field[h][w] = get[w];
			}
		}

		for(int x = 0;x<W;x++){
			for(int y = 0;y<H;y++){
				if(field[x][y].equals("#"))field = m.haba(field,0,x,y);
				if(!m.canDraw){
					System.out.println("No");
					System.exit(0);
				}
			}
		}

		System.out.println("Yes");
	}

	String[][] haba(String[][] f, int c, int x, int y) {
		// c...counter,1でbreakならNo出力
		// TODO: 四方向黒かどうか->黒方向に幅探索

		f[x][y] = ".";

		int h = f.length-1;		//それぞれ配列番号
		int w = f[0].length-1;
		//String up,down,left,right;
		if(x!=0){
			if(f[x-1][y].equals("#")){
				c++;
				f = haba(f,c,x-1,y);
			}
		}
		if(y!=0){
			if(f[x][y-1].equals("#")){
				c++;
				f = haba(f,c,x,y-1);
			}
		}
		if(x!=w){
			if(f[x+1][y].equals("#")){
				c++;
				f = haba(f,c,x+1,y);
			}
		}
		if(y!=h){
			if(f[x][y+1].equals("#")){
				c++;
				f = haba(f,c,x,y+1);
			}
		}

		if(c == 0)canDraw = false;

		return f;

	}
}