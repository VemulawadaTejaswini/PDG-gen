import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		List<Integer> c = new ArrayList<>();

		for(int i=0;i<N;i++) {
			a.add(sc.nextInt());
		}
		Collections.sort(a);

		for(int i=0;i<N;i++) {
			b.add(sc.nextInt());
		}
		Collections.sort(b);

		for(int i=0;i<N;i++) {
			c.add(sc.nextInt());
		}
		Collections.sort(c);

		int ans = 0;
		for(int i=0;i<N;i++) {
			int aless = 0;
			int cmore = 0;
			int bi = b.get(i);
			aless = binary(a,bi);
			while(a.get(aless) < bi) {
				aless++;
				if(aless >= a.size()) break;
			}

			cmore = binary(c,bi);
			while(bi < c.get(cmore)) {
				cmore--;
				if(cmore < 0) break;
			}
			cmore = c.size() - cmore - 1;
//			System.out.println(aless + ":" + cmore);
			ans += aless * cmore;
		}
		System.out.println(ans);
	}

	public static int binary(List<Integer> x,int y) {

		int left = 0;
		int right = x.size()-1;
		while(left < right) {
			int mid = (left + right)/2;
			if(x.get(mid) == y) {
				return mid;
			}else if(y < x.get(mid)) {
				right = mid;
			}else {
				left = mid + 1;
			}
		}
		return left;
	}
}