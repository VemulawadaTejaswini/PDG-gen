import java.util.*;

public class Main{
	
	class C implements Comparable<C>{
		String s;
		int p;
		public C(String s, int p) {
			this.s = s;
			this.p = p;
		}
		public int compareTo(C o) {
			return o.p - this.p;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		boolean isfirst = true;
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			if(! isfirst){
				System.out.println();
			}
			else{
				isfirst = false;
			}
			
			C [] data = new C[n];
			for(int i = 0; i < n; i++){
				String s = sc.next();
				int nowp = sc.nextInt() * 3 + sc.nextInt() * 0 + sc.nextInt() * 1;
				data[i] = new C(s, nowp);
			}
			Arrays.sort(data);
			for(int i = 0; i < n; i++){
				System.out.println(data[i].s + ","+data[i].p);
			}
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}