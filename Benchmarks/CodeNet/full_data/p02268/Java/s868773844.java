import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//5-3 二分探索
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		ArrayList<Integer> S = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			S.add(Integer.parseInt(sc.next()));
		}
		int q = Integer.parseInt(sc.next());
		ArrayList<Integer> T = new ArrayList<>();
		for(int i = 0; i < q; i++) {
			T.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		//二分探索
		int i = 0;
		int count = 0;
		while(i != T.size()) {
			int left = 0;
			int right = S.size();
			int key = T.get(i);
			while(left < right) {
				int mid = (left + right) / 2;
				if(S.get(mid) == key) {
					count++;
					break;
				}else if(key < S.get(mid)) {
					right = mid;
				}else {
					left = mid + 1;
				}
			}
			i++;
		}
		System.out.println(count);
	}
}
