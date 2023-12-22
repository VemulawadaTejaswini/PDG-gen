
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int maxw, n;
	int[] w;
	Pair[] elements;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(int cnt=1;;cnt++) {
			maxw = sc.nextInt();
			if ( maxw == 0 ) break;
			w = new int[maxw+1];
			n = sc.nextInt();
			elements = new Pair[n];
			
			fill(w, -1);
			w[0] = 0;
			
			for(int i=0;i<n;i++) {
				String s = sc.next();
				String[] str = s.split(",");
				elements[i] = new Pair(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
			}
			sort(elements);
			System.out.println("case " + cnt + ":");
			dp();
		}
	}
	
	void dp() {
		for(int i=0;i<n;i++) for(int j=maxw;j>=elements[i].s;j--) {
			if( w[j-elements[i].s] >= 0 ) 
				w[j] = max(w[j], w[j-elements[i].s] + elements[i].f);
		}
		int cw = 0,cv = 0;
		for (int i=0;i<=maxw;i++) {
			if(cv < w[i]) {cv = w[i]; cw = i;}  
		}
		System.out.println(cv);
		System.out.println(cw);
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	class Pair implements Comparable<Pair> {
		int f, s;
		Pair(int f, int s) {
			this.f = f;
			this.s = s;
		}
		@Override
		public int compareTo(Pair o) {
			// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
			return s - o.s;
		}
	}
}