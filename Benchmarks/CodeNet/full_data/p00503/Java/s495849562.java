import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] X1 = new int[N];
		int[] X2 = new int[N];
		int[] Y1 = new int[N];
		int[] Y2 = new int[N];
		int[] D1 = new int[N];
		int[] D2 = new int[N];
		TreeSet<Integer> xset = new TreeSet<Integer>();
		TreeSet<Integer> yset = new TreeSet<Integer>();
		TreeSet<Integer> dset = new TreeSet<Integer>();
		for (int i = 0; i < N; ++i) {
			X1[i] = sc.nextInt();
			Y1[i] = sc.nextInt();
			D1[i] = sc.nextInt();
			X2[i] = sc.nextInt();
			Y2[i] = sc.nextInt();
			D2[i] = sc.nextInt();
			xset.add(X1[i]);
			xset.add(X2[i]);
			yset.add(Y1[i]);
			yset.add(Y2[i]);
			dset.add(D1[i]);
			dset.add(D2[i]);
		}
		ArrayList<Integer> xs = new ArrayList<Integer>();
		ArrayList<Integer> ys = new ArrayList<Integer>();
		ArrayList<Integer> ds = new ArrayList<Integer>();
		for (int v : xset) {
			xs.add(v);
		}
		for (int v : yset) {
			ys.add(v);
		}
		for (int v : dset) {
			ds.add(v);
		}
		HashMap<Integer, Integer> xmap = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> ymap = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> dmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < xs.size(); ++i) {
			xmap.put(xs.get(i), i);
		}
		for (int i = 0; i < ys.size(); ++i) {
			ymap.put(ys.get(i), i);
		}
		for (int i = 0; i < ds.size(); ++i) {
			dmap.put(ds.get(i), i);
		}
		int[][][] count = new int[xs.size()][ys.size()][ds.size()];
		for (int i = 0; i < N; ++i) {
			int minx = xmap.get(X1[i]);
			int maxx = xmap.get(X2[i]);
			int miny = ymap.get(Y1[i]);
			int maxy = ymap.get(Y2[i]);
			int mind = dmap.get(D1[i]);
			int maxd = dmap.get(D2[i]);
			for (int j = minx; j < maxx; ++j) {
				for (int k = miny; k < maxy; ++k) {
					for (int l = mind; l < maxd; ++l) {
						count[j][k][l]++;
					}
				}
			}
		}
		long ans = 0;
		for (int i = 0; i < xs.size() - 1; ++i) {
			long x = xs.get(i + 1) - xs.get(i);
			for (int j = 0; j < ys.size() - 1; ++j) {
				long y = ys.get(j + 1) - ys.get(j);
				for (int k = 0; k < ds.size() - 1; ++k) {
					if (count[i][j][k] >= K) {
						long d = ds.get(k + 1) - ds.get(k);
						ans += x * y * d;
					}
				}
			}
		}
		System.out.println(ans);
	}

}