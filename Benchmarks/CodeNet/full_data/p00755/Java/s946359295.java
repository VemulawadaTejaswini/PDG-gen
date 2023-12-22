/**
 * 
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author kumar1
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			solve();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	/**
	 * @throws IOException
	 * 
	 */
	private static void solve() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<ArrayList<Byte>> list = new ArrayList<ArrayList<Byte>>();
		//File file = new File("ccase.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader in = new BufferedReader(new FileReader(file));
		String s;
		while ((s = in.readLine()) != null) {
			Scanner scan = new Scanner(s);
			int n = 0;
			ArrayList<Byte> l = new ArrayList<Byte>();
			while (scan.hasNextInt()) {
				n = scan.nextInt();
				l.add((byte) n);
			}
			list.add(l);
			scan.close();
			if (n == 0)
				break;
		}
		in.close();
		//System.out.println(list);
		for (int i = 0; i < list.size();) {
			if (list.get(i).get(0) == 0)
				break;
			int h, w, c;
			h = list.get(i).get(0);
			w = list.get(i).get(1);
			c = list.get(i).get(2);
			ans(c, list.subList(i + 1, i + 1 + h));
			i = i + 1 + h;
		}
	}

	/**
	 * @param h
	 * @param w
	 * @param c
	 * @param subList
	 */
	private static void ans(int c, List<ArrayList<Byte>> list) {
		// TODO 自動生成されたメソッド・スタブ
		//System.out.println(list);
		byte[][] arr = new byte[list.size()][list.get(0).size()];
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.get(0).size(); j++) {
				arr[i][j] = list.get(i).get(j);
			}
		}
		/*
		dfs(arr, 1, 3, 0, 0);
		dfs(arr, arr[0][0], 6, 0, 0);
		for(int j=0; j < arr.length; j++) {
			for(int k=0; k < arr[0].length; k++) {
				System.out.print(arr[j][k] + " ");
			}
			System.out.println();
		}
		System.out.println(count(arr, arr[0][0], 0, 0, 1));
		*/
		System.out.println(pat(c, arr, 0));
	}

	/**
	 * @param c : 最後の色
	 * @param arr : 基板の配列
	 * @param i : ループ回数
	 * @return
	 */
	private static int pat(int c, byte[][] arr, int i) {
		// TODO 自動生成されたメソッド・スタブ
		byte[][] carr;
		i++;
		if(i > 4) { // 5回目はc
			carr = cp2dIntArray(arr);
			dfs(carr, carr[0][0], c, 0, 0);
			/*
			for(int j=0; j < carr.length; j++) {
				for(int k=0; k < carr[0].length; k++) {
					System.out.print(carr[j][k] + " ");
				}
				System.out.println();
			}
			*/
					
			return count(carr, c, 0, 0, 1);
		}
		int max = 0;
		// 1, 2, 3, 4回目は全色
		for(int j=1; j <= 6; j++) {
			if(arr[0][0] == j)
				continue;
			carr = cp2dIntArray(arr);
			int cnb = count(carr, carr[0][0], 0, 0, 1);
			dfs(carr, carr[0][0], j, 0, 0);
			int cna = count(carr, carr[0][0], 0, 0, 1);
			int n = cna;
			if(cnb != cna)
				n = pat(c, carr, i);
			if(max < n) {
				max = n;
			}
		}
		
		return max;
	}

	/**
	 * @param c : 値がcの要素の数を求める
	 * @return
	 */
	private static int count(byte[][] arr, int c, int x, int y, int cnt) {
		// TODO 自動生成されたメソッド・スタブ
		byte[][] carr = cp2dIntArray(arr);
		return countr(carr, c, x, y, cnt);
	}
	
	private static int countr(byte[][] carr, int c, int x, int y, int cnt) {
		// TODO 自動生成されたメソッド・スタブ
		carr[y][x] = 0;
		int[][] n = new int[4][2];
		n[0][0] = y; n[0][1] = x + 1;
		n[1][0] = y; n[1][1] = x - 1;
		n[2][0] = y + 1; n[2][1] = x;
		n[3][0] = y - 1; n[3][1] = x;
		
		for(int i=0; i < 4; i++) {
			int nx = n[i][1];
			int ny = n[i][0];
			if(0 <= nx && nx < carr[0].length && 0 <= ny && ny < carr.length) {
				if(carr[ny][nx] == c)
					cnt = countr(carr, c, nx, ny, cnt + 1);
			}
		}
		return cnt;
	}

	/**
	 * @param carr
	 * @param j : dfsした結果置換するやつ
	 * @param x : x座標
	 * @param y : y座標
	 */
	private static void dfs(byte[][] carr, int before, int after, int x, int y) {
		// TODO 自動生成されたメソッド・スタブ
		carr[y][x] = (byte) after;
		int[][] n = new int[4][2];
		n[0][0] = y; n[0][1] = x + 1;
		n[1][0] = y; n[1][1] = x - 1;
		n[2][0] = y + 1; n[2][1] = x;
		n[3][0] = y - 1; n[3][1] = x;
		for(int i=0; i < 4; i++) {
			int nx = n[i][1];
			int ny = n[i][0];
			if(0 <= nx && nx < carr[0].length && 0 <= ny && ny < carr.length) {
				if(carr[ny][nx] == before && before != after)
					dfs(carr, before, after, nx, ny);
			}
		}
	}
	
	private static byte[][] cp2dIntArray(byte[][] x) {
		byte[][] ret = new byte[x.length][];
		for(int i=0; i < x.length; i++)
			ret[i] = x[i].clone();
		return ret;
	}

}