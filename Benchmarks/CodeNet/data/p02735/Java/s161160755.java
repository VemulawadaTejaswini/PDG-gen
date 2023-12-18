import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int H = sc.nextInt();
		final int W = sc.nextInt();
		
		char[][] field = new char[H][];
		for (int i = 0; i < H; i++) {
			field[i] = sc.next().toCharArray();
		}
		
		Queue<Pair<Integer, Integer>> que = new ArrayDeque<>();
		que.add(new Pair<>(0, 0));
		
		int[][] numBlack = new int[H][W];
		for (int i = 0; i < H; i++) {
			Arrays.fill(numBlack[i], -1);
		}
		
		numBlack[0][0] = field[0][0] == '#' ? 1 : 0;
		
		int[] dh = {0, 1};
		int[] dw = {1, 0};
		
		int cnt = 0;
		while (!que.isEmpty()) {
			cnt++;
			Pair<?, ?> pair = que.poll();
			int h = (int) pair.getKey();
			int w = (int) pair.getValue();
			
			for (int i = 0; i < 2; i++) {
				int nh = h + dh[i];
				int nw = w + dw[i];
				if (H <= nh || W <= nw) {
					continue;
				}
				
				int b = numBlack[h][w];
				
				if (field[nh][nw] == '#') {
					b++;
				}
				int nb = numBlack[nh][nw];
				if (nb != -1 && nb < b) {
					continue;
				}
				numBlack[nh][nw] = b;
				que.add(new Pair<>(nh, nw));
			}
		}
		
		// printField(numBlack);
		// System.out.println("cnt:" + cnt);
		System.out.println(numBlack[H - 1][W - 1]);
		
		sc.close();
	}
	
	static void printField(int[][] f) {
		System.out.println();
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < f[i].length; j++) {
				System.out.print(f[i][j]);
			}
			System.out.println();
		}
	}
}

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
	private static final long serialVersionUID = 1L;
	
	public Pair(final K key, final V val) {
		super(key, val);
	}
}
