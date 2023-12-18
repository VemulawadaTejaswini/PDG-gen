import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[][] map = new String[h][w];
		int[][] moves = new int[h][w];
		for(int i=0; i<h; i++){
			map[i] = sc.next().split("");
		}

		for(int i=0; i<h; i++){
			boolean[] done = new boolean[w];
			for(int j=0; j<w; j++){
				if (map[i][j].equals("#")) continue;
				if (done[j]) continue;	
				int l = 0;
				while (j+l < w) {
				  if (map[i][j+l].equals("#")) break;
				  ++l;
				}
				for(int k=0; k<l; k++){
					moves[i][j+k] += l;
					done[j+k] = true;
				}
			}
		}

		for(int j=0; j<w; j++){
			boolean[] done = new boolean[h];
			for(int i=0; i<h; i++){
				if (map[i][j].equals("#")) continue;
				if (done[i]) continue;	
				int l = 0;
				while (i+l < h) {
				  if (map[i+l][j].equals("#")) break;
				  ++l;
				}
				for(int k=0; k<l; k++){
					moves[i+k][j] += l;
					done[i+k] = true;
				}
			}
		}

		int ans = 0;
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				ans = Math.max(ans, moves[i][j]-1);
			}
		}
		System.out.println(ans);
	}
}
