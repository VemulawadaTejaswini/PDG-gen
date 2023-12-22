import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Point {
	int x;
	int y;
	Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0 0")) {
				StringTokenizer st = new StringTokenizer(buf);
				int H = Integer.parseInt(st.nextToken());
				int W = Integer.parseInt(st.nextToken());
				int field[][] = new int[H][W];
				boolean check[][] = new boolean[H][W];
				if (H==0||W==0) {
					System.out.println(0);
					continue;
				}
				for (int i=0;i<H;i++) {
					Arrays.fill(check[i],false);
					buf = br.readLine();
					for (int j=0;j<W;j++) {
						if (buf.charAt(j)=='@') {
							field[i][j] = 0;
						} else if (buf.charAt(j)=='#') {
							field[i][j] = 1;
						} else {
							field[i][j] = 2;
						}
					}
				}
				int count = 0;
				Point queue[] = new Point[H*W];
				for (int i=0;i<H;i++) {
					for (int j=0;j<W;j++) {
						if (!check[i][j]) {
							int q = 0;
							queue[q++] = new Point(i,j);
							while (q>0) {
								Point t = queue[--q];
								if (!check[t.x][t.y]) {
									check[t.x][t.y] = true;
									if (t.x+1<H) {
										if (!check[t.x+1][t.y]&&field[t.x][t.y]==field[t.x+1][t.y]) queue[q++] = new Point(t.x+1,t.y);
									}
									if (t.x-1>=0) {
										if (!check[t.x-1][t.y]&&field[t.x][t.y]==field[t.x-1][t.y]) queue[q++] = new Point(t.x-1,t.y);
									}
									if (t.y+1<W) {
										if (!check[t.x][t.y+1]&&field[t.x][t.y]==field[t.x][t.y+1]) queue[q++] = new Point(t.x,t.y+1);
									}
									if (t.y-1>=0) {
										if (!check[t.x][t.y-1]&&field[t.x][t.y]==field[t.x][t.y-1]) queue[q++] = new Point(t.x,t.y-1);
									}
								}
							}
							count++;
						}
					}
				}
				//printField(field,H,W);
				//printField(check,H,W);
				System.out.println(count);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printField(int[][] a,int H,int W) {
		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) System.out.print(a[i][j]);
			System.out.println();
		}
	}
}