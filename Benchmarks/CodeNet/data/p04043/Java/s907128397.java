import java.util.Scanner;

public class Main {

	/*
	 * 問題文 日本の誇る美しいリズムとして、五七五というものがあります。
	 * いろはちゃんは五七五が大好きです。
	 *
	 * 3 つの文節の並びの長さがそれぞれ 5,7,5 となるようにこの順番で並んでいるとき、
	 * その 3 つの文節の並びは五七五であると言います。
	 *
	 * 並び替えたい 3 つの文節の長さを表す整数 A,B,C が与えられるので、
	 * それらの文節を並び替えて五七五にできるか判定してください。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int count = 0;
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == 7) {
				count += 7;
			} else if (arr[i] == 5) {
				count += 5;
			}
		}
		if (count == 17) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}