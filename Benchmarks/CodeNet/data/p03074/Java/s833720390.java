import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();
		int[] a = new int [n];
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(S.substring(i, i+1));
		}
		//0 == -cnt  1 == +cnt
		List<Integer> list = new ArrayList<Integer>();
		//0ならtrue 1ならfalse;
		boolean Evenf = true;
		if(a[0]==1) Evenf = false;
		if(a.length==1) {
			if(!Evenf)list.add(1);
		}

		//a[0]が0ならば0をlistの先頭に追加して調整
		if(Evenf) list.add(0);

		for(int i=1,cnt=1;i<n;i++) {

			if(a[i]==a[i-1]) {
				cnt++;
				if(i==n-1) {
					if(Evenf) {
						list.add(cnt);//list.add(-cnt);
					}else {
						list.add(cnt);
					}
				}
			}else {
				if(Evenf) {
					list.add(cnt);//list.add(-cnt);
					Evenf=false;
				}else {
					list.add(cnt);
					Evenf=true;
				}
				cnt=1;
			}

		}

		//for(int i=0;i<list.size();i++)System.out.println(list.get(i));


		List<Integer> sums = new ArrayList<Integer>();
		Evenf = true;
		if(a[0]==1) Evenf = false;

		for(int loop=0,l=0,r=K*2+1;loop<list.size();loop+=2,l+=2,r+=2) {
			int sum = 0;
			for(int i=l;i<r&&i<list.size();i++) {
				sum += list.get(i);
			}

			sums.add(sum);
		}


		Collections.sort(sums,Collections.reverseOrder());
		//for(int i=0;i<sums.size();i++)System.out.println(sums.get(i));

		System.out.println(sums.get(0));
	}

}