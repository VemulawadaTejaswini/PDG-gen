import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		// 入力
		String n;
		final int k;
		final int[] d;	// 0≦D1<D2<…<DK≦9
		try(Scanner scan = new Scanner(System.in)) {
			n = scan.next();
			k = scan.nextInt();
			d = new int[k];
			for (int i = 0; i < k; i++) {
				d[i] = scan.nextInt();
			}
			
		}
		
		// 嫌いでない数字の配列
		final int[] like = IntStream.range(0, 10).filter(i -> !Arrays.stream(d).anyMatch(dd -> dd == i)).toArray();
		// maxはlike[10 - k -1] minはlike[0]
		
		
		// 各位の数字
		final int[] value = new int[4];		//1≦N<10000より4桁
		for (int i = 0; i < 4 - n.length(); i++) {
			n = "0" + n;
		}
		for (int i = 0; i < 4; i++) {
			value[i] = Integer.parseInt(n.substring(i, i + 1));
		}
		
		int[] result = new int[5];
		boolean top = false;	//最初の桁が現れればtrue
		boolean big = false;	//大きいことが確定すればtrue
		final int likeMax = like[like.length - 1];
		
		result[0] = 0;
		for (int j = 0; j < 4; j++) {
			final int i = j;
			//System.out.println(value[i]);
			if (!top && value[i] ==0) {
				result[i] = 0;
				continue;
			} else {
				top = true;
			}

			if (big) {
				result[i + 1] = like[0];
			} else {
				if (value[i] <= likeMax) {
					result[i + 1] = Arrays.stream(like).filter(likevalue -> likevalue >= value[i]).min().getAsInt();
					big = value[i] < result[i + 1];
				} else {		// value[i] > likeMax
					moveUp(result, like, i);
					big = true;
				}
			}
						
		}

		
		//数値に戻す
		// 出力
		out.println(Arrays.stream(result).reduce((start, element) -> start * 10 + element).getAsInt());
		out.flush();
	}
	
	//繰り上がり
	static void moveUp(int[] result, int[] like, int i) {
		final int likeMax = like[like.length - 1];
		if (result[i] < likeMax) {		// i == 0でtrueになる
			result[i] = Arrays.stream(like).filter(likevalue -> likevalue > result[i]).min().getAsInt();
			result[i+1] = like[0];
		} else {
			result[i+1] = like[0];
			moveUp(result, like, i -1);
		}

		
	}
	
}
