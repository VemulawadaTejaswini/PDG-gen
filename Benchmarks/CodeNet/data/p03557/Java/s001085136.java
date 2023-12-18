import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int ans = 0;
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		Map<Integer, ArrayList<Integer>> Amap = new HashMap<Integer, ArrayList<Integer>>();
		Map<Integer, ArrayList<Integer>> Bmap = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i< N; i++) {
			A[i] = reader.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			Amap.put(A[i], list);
		}
		for (int i = 0; i< N; i++) {
			B[i] = reader.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			Bmap.put(B[i], list);
			for (int j = 0; j< N; j++) {
				if (A[j] < B[i]) {
					Amap.get(A[j]).add(B[i]);
				}
			}
		}
		for (int i = 0; i< N; i++) {
			C[i] = reader.nextInt();
			for (int j = 0; j< N; j++) {
				if (B[j] < C[i]) {
					Bmap.get(B[j]).add(C[i]);
				}
			}
		}
		for (int i = 0; i < N; i++) {
			ArrayList<Integer> list = Amap.get(A[i]);
			for (int j = 0; j < list.size(); j++) {
				ArrayList<Integer> Blist = Bmap.get(list.get(j));
				ans += Blist.size();
			}
		}


		System.out.println(ans);
		reader.close();
	}
}



