import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {

	static int h, w;
	static int[][] field;
	static int[] v1 = { 0, 1, 0, -1 };
	static int[] v2 = { 1, 0, -1, 0 };

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			h = cin.nextInt();
			w = cin.nextInt();
			if (h + w == 0) {
				break;
			}
			field = new int[h + 2][w + 2];
			for (int i = 0; i < h; i++) {
				String str = cin.next();
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == '#') {
						field[i + 1][j + 1] = 1;
					} else if (str.charAt(j) == '@') {
						field[i + 1][j + 1] = 2;
					} else {
						field[i + 1][j + 1] = 3;
					}
				}
			}
			int count=0;
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					if (field[i][j] == 0) {
						continue;
					} else {
						count++;
						Queue<Integer[]> que = new LinkedList<Integer[]>();
						Integer[] a = { i, j };
						que.add(a);
						int value = field[i][j];
						while (!que.isEmpty()) {
							Integer[] c = que.poll();
							field[c[0]][c[1]]=0;
							for(int k = 0;k<4;k++){
								int xx=c[0]+v1[k];
								int yy=c[1]+v2[k];
								if(field[xx][yy]==value){
									Integer[] d = {xx,yy};
									que.add(d);
								}
							}
						}
					}
				}
			}
			System.out.println(count);
		}

	}
}