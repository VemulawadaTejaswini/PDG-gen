import java.io.Closeable;
import java.util.*;
public class Main {
	//0935 start
	
	class State {
		int step;
		String str;
		public State(int step, String s) {
			this.step = step;
			this.str = s;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0 )break;
			String [] a = new String[n];
			String [] b = new String[n];
			for(int i = 0 ; i < n; i++){
				a[i] = sc.next();
				b[i] = sc.next();
			}
			String start = sc.next();
			String end = sc.next();
			LinkedList<State> open = new LinkedList<Main.State>();
			open.add(new State(0, start));
			HashSet<String> close = new HashSet<String>();
			close.add(start);
			int ans = -1;
			while(! open.isEmpty()){
				State now = open.poll();
				if(now.str.equals(end)){
					ans = now.step;
					break;
				}
				
				for(int i = 0 ; i < n; i++){
					String nstr = now.str.replaceAll(a[i], b[i]);
					if(nstr.length() > end.length()) {
						continue;
					}
					if(close.contains(nstr)) continue;
					close.add(nstr);
					open.add(new State(now.step + 1, nstr));
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}