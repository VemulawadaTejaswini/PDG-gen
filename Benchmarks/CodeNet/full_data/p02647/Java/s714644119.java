import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmp1 = br.readLine().split(" ");
		String[] tmp2 = br.readLine().split(" ");

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

					int l = Math.max(0, j - count);
					int r = Math.min(n, j + count + 1);

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