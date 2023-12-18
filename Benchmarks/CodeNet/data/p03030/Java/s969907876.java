import java.util.*;

public class Main {
	static class Spclass {
		int m;
		String s;
		int p;
	}

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Spclass[] sp = new Spclass[n];
		for(i = 0; i < n; i++) {
			sp[i] = new Spclass();
			sp[i].m = i + 1;
			sp[i].s = sc.next();
			sp[i].p = Integer.parseInt(sc.next());
		}
		sc.close();
		sc = null;
		Arrays.sort(sp, new Comparator<Spclass>() {
			 public int compare(Spclass sp1, Spclass sp2) {
				 int tmp = sp1.s.compareTo(sp2.s);
				 if(tmp == 0) tmp  = sp2.p - sp1.p;
				 return tmp;
			 }
		});
		for(i = 0; i < n; i++) {
			System.out.println(sp[i].m);
		}
	}
	
}
