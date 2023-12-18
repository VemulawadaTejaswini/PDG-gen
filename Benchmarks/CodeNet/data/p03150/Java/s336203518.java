import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String[] imp = sc.nextLine().split("");

		String[] target = { "k", "e", "y", "e", "n", "c", "e" };

		if (imp.length < target.length) {
			System.out.println("NO");
		} else if (imp.length == target.length) {
			if (imp.equals(target)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {

			// 始点になりうる位置をすべて取得。
			ArrayList<Integer> startList = new ArrayList<Integer>();
			for (int j = 0; j < imp.length; j++) {
				if (imp[j].equals(target[0])) {
					startList.add(j);
				}
			}

			boolean ansFlag = false;
			for (int start : startList) {
				boolean skipFlag = false;
				int i = 0;
				int t = 0;
				while (start + i < imp.length && t < target.length) {
					if (imp[start + i].equals(target[t])) {//同じ文字だったら次の文字へ
						i++;
						t++;
					} else if (!imp[start + i].equals(target[t]) && skipFlag == false) {
						//別の文字だったら、targetの文字が出てくる位置を探す
						i++;
						skipFlag = true;
						for (int k = start + i; k < imp.length; k++) {
							if (imp.equals(target[t])) {
								i = i + k;
							}
						}
					} else if (skipFlag == true) {
						i = 0;
						t = 0;
						skipFlag = false;
						break;
					}
				}
				if (t == target.length) {
					ansFlag = true;
				}
			}
			if (ansFlag = true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}

}