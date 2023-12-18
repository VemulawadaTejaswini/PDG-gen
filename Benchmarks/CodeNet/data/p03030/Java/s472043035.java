
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class R implements Comparable<R>{
		int n;
		String s;
		int p;
		R(int n, String s, int p){
			this.n=n;
			this.s=s;
			this.p=p;
		}
		@Override
		public int compareTo(R arg0) {
			if(this.s.equals(arg0.s)) {
				return Integer.compare(arg0.p, this.p);
			}else {
				return this.s.compareTo(arg0.s);
			}
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		ArrayList<R> l = new ArrayList<>();
		for(int i=0; i<N; i++) {
			String s = sc.next();
			int p = sc.nextInt();
			R r = new R(i+1, s, p);
			l.add(r);
		}
		Collections.sort(l);
		for(R r : l) {
			System.out.println(r.n);
		}
		sc.close();
	}


}
