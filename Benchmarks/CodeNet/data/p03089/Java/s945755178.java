import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
public class Main {
	public static void main(String[] args)  throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int N = Integer.parseInt(line);
		String[] b_str =reader.readLine().split(" ");

		LinkedList<Integer> b = new LinkedList<>();
		int num = 1;
		for (int i = 0; i < b_str.length; i++) {
			b.add(Integer.parseInt(b_str[i]));
			num *= (i+1);
		}
		//num = b_str.length * (b_str.length-1);

		LinkedList<Integer> a = new LinkedList<>();
		int[] ans = new int[b_str.length];
		int[][] j = new int[num][b_str.length];
		boolean flag = false;

		outer:
		for (int k = 0; k < num; k++) {    //num
			//jの組み合わせが今までと同じものを除外
			for (int i = 1; i <= b.size(); i++) {
				j[k][i-1] = (int)Math.round(Math.random()*(i-1) + 1);
			}
			boolean ff = false;
			for (int kk = 0; kk < k; kk++) {
				ff = true;
				for (int i = 1; i <= b.size(); i++) {
					if (j[k][i-1] != j[kk][i-1]) {
						ff = false;
					}
				}
				if (ff) {
					break;
				}
			}

			//list aへの挿入
			if (ff) {
				k--;
				a = new LinkedList<>();
				ans = new int[b_str.length];
			}
			if (!ff) {
				for (int i = 1; i <= b.size(); i++) {
					if (j[k][i-1]-1 >= a.size()) {
						a.add(j[k][i-1]);
					}
					else {
						a.add(j[k][i-1]-1, j[k][i-1]);
					}
					ans[i-1] = j[k][i-1];
				}

				boolean f = true;
				for (int aa = 0; aa < b.size(); aa++) {
					if (a.get(aa) != b.get(aa)) {
						f = false;
					}
				}

				//if (b.equals(a)) {
				if (f) {
					flag = true;
					break outer;
				}
				else {
					a = new LinkedList<>();
					ans = new int[b_str.length];
				}
			}
		}

		if (flag) {
			for (int i = 0; i < b_str.length; i++) {
				System.out.println(ans[i]);
			}
		}
		else {
			System.out.println("-1");
		}
	}
}
