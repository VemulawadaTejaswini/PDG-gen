import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://atcoder.jp/contests/abc167/tasks/abc167_d
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] array = new int[n+1];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		List<Integer> list = new ArrayList<Integer>();
		int tmp = 1;

		int end = -1;
		list.add(1);
		for(int i=0;i<=n++;i++) {
			tmp = array[tmp-1];
			if(list.contains(tmp)) {
				list.add(tmp);
				end = i;
				break;
			}else {
				list.add(tmp);
			}
		}

		int start = -1;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==list.get(end+1)) {
				start = i;
				break;
			}
		}

		int rep = end+1 - start;

		int ans = 1;
		for(int i=1;i<=start+(k-start)%rep;i++) {
			ans = array[ans-1];
		}

		System.out.println(ans);
	}
}
