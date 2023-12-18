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
		LinkedList<Integer> a = new LinkedList<>();
		int[] ans = new int[b_str.length];
		boolean flag = false;

		for (int k = 0; k < num*num*num; k++) {    //num
			for (int i = 1; i <= b.size(); i++) {
				int j= (int)Math.round(Math.random()*(i-1) + 1);
				if (j > a.size()) {
					a.add(j);
				}
				else {
					a.add(j-1, j);
				}
				ans[i-1] = j;
			}
			
//			for (int i = 0; i < b_str.length; i++) {
//				System.out.print(a.get(i) + " ");
//			}
//			System.out.println();
			
			boolean f = true;
			for (int aa = 0; aa < a.size(); aa++) {
				if (a.get(aa) != b.get(aa)) {
					f = false;
				}
			}
			//if (b.equals(a)) {
			if (f) {
				flag = true;
				break;
			}
			else {
				a = new LinkedList<>();
				ans = new int[b_str.length];
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
