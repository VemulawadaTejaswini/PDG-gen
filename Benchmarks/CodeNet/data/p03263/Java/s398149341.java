import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int a[][] = new int[H][W];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				a[i][j] = Integer.parseInt(sc.next()) % 2;
			}
		}
		Queue<Integer> ans_y1 = new ArrayDeque<Integer>();
		Queue<Integer> ans_x1 = new ArrayDeque<Integer>();
		Queue<Integer> ans_y2 = new ArrayDeque<Integer>();
		Queue<Integer> ans_x2 = new ArrayDeque<Integer>();
		for(int h = 0; h < H; h++) {
			if(h % 2 == 0) {
				for(int w = 0; w < W; w++) {
					if(a[h][w] == 1) {
						if(w == W - 1) {
							if(h != H - 1) {
								a[h][w]--;
								ans_y1.add(h);
								ans_x1.add(w);
								a[h + 1][w]++;
								ans_y2.add(h + 1);
								ans_x2.add(w);
							}
						} else {
							a[h][w]--;
							ans_y1.add(h);
							ans_x1.add(w);
							a[h][w + 1]++;
							ans_y2.add(h);
							ans_x2.add(w + 1);
						}

					}
				}
			} else {
				for(int w = W - 1; w >= 0; w--) {
					if(a[h][w] == 1) {
						if(w == 0) {
							if(h != H - 1) {
								a[h][w]--;
								ans_y1.add(h);
								ans_x1.add(w);
								a[h + 1][w]++;
								ans_y2.add(h + 1);
								ans_x2.add(w);
							}
						} else {
							a[h][w]--;
							ans_y1.add(h);
							ans_x1.add(w);
							a[h][w - 1]++;
							ans_y2.add(h);
							ans_x2.add(w - 1);
						}
					}
				}
			}
		}
		int ans_cnt = ans_y1.size();
		System.out.println(ans_cnt);
		for(int i = 0; i < ans_cnt; i++) {
			System.out.print(ans_y1.poll() + 1 + " ");
			System.out.print(ans_x1.poll() + 1 + " ");
			System.out.print(ans_y2.poll() + 1 + " ");
			System.out.println(ans_x2.poll() + 1);
		}
	}
}
