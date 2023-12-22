import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp1 = scanner.nextLine().split(" ");
		String[] tmp2 = scanner.nextLine().split(" ");

		int n = Integer.parseInt(tmp1[0]);
		int k = Integer.parseInt(tmp1[1]);
		int[] list = new int[n];

		for(int i = 0; i < n; i++) {

			list[i] = Integer.parseInt(tmp2[i]);

		}
		for(int i = 0; i < k; i++) {

			//被っている電球の数
			int[] plist = new int[n];


			for(int j = 0; j < n; j ++) {

				if(list[j] > 0) {

					int count = list[j];

					int l = j - count - 0.5 >= 0 ? (int)Math.ceil(j - count - 0.5) : 0;
					int r = j + count + 0.5 < n ? (int)Math.ceil(j + count + 0.5) : n;

					for(int x = l; x < r ; x++) {
						plist[x]++;
					}

				}else {
					plist[j]++;
				}

			}


			for(int j = 0 ; j < n; j++) {
				//リスト強さの数
				list[j] = plist[j];
			}
		}

		for(int s : list) {
			System.out.println(s);
		}
	}
}