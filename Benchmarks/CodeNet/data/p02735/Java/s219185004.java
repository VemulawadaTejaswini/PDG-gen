import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 読み込み
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		List<List<Integer>> list = new ArrayList<>();
		
		// 1は黒(#), 0は白(.)
		for (int h = 0; h < H; h++) {
			String[] strArray = sc.next().split("");
			List<Integer> subList = new ArrayList<>();
			for (String s : strArray) {
				if (s.equals("#")) {
					subList.add(1);
				} else {
					subList.add(0);
				}
			}
			list.add(subList);
		}
		//System.out.println(list);

		List<List<Integer>> cost = new ArrayList<>();

		for (int h = 0; h < H; h++) {
			List<Integer> subCost = new ArrayList<>();
			for (int w = 0; w < W; w++) {
				int leftCost, upCost;

				if (h == 0) {
					upCost = H*W;
				} else {
					upCost = cost.get(h-1).get(w);
				}
				if (w == 0) {
					leftCost = H*W;
				} else {
					leftCost = subCost.get(w-1);
				}

				if (h == 0 && w == 0) {
					subCost.add(list.get(h).get(w));
				}
				else if (leftCost > upCost) {
					subCost.add(list.get(h).get(w) + upCost);
				} else {
					subCost.add(list.get(h).get(w) + leftCost);
				}
				//System.out.println(h + ":"+  w + "->" + cost[h][w]);
			}
			//System.out.println(subCost);
			cost.add(subCost);
		}

		System.out.println(cost.get(H-1).get(W-1));
	}
}
