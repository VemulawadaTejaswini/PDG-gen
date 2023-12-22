import java.util.*;

public class Main {
	int p;
	
	class C implements Comparable<C>{
		int id,ans,time;
		int [] wrong;
		public C(int id, int ans, int time) {
			this.id = id;this.ans = ans;this.time = time;
			wrong = new int[p+1];
		}

		public int compareTo(C o) {
			if(ans < o.ans) return 1;
			if(ans > o.ans) return -1;
			if(time < o.ans) return -1;
			if(time > o.time) return 1;
			if(id < o.id) return -1;
			if(id > o.id) return 1;
			return 0;
		}
		
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int t = sc.nextInt();
			p = sc.nextInt();
			int r = sc.nextInt();
			if(t == 0 && p == 0 && r == 0){
				break;
			}
			C [] data = new C[t+1];
			for(int i=0; i <= t; i++){
				if(i == 0){
					data[i] = new C(-1,-1,0);
				}
				else{
					data[i] = new C(i,0,0);
				}
			}
			for(int i=0; i < r; i++){
				int tt = sc.nextInt();
				int pp = sc.nextInt();
				int time = sc.nextInt();
				String msg = sc.next();
				if(msg.equals("WRONG")){
					data[tt].wrong[pp]++;
				}
				else{
					data[tt].time += time + data[tt].wrong[pp] * 1200;
					data[tt].ans++;
				}
			}
			Arrays.sort(data);
			for(int i=0; i < t; i++){
				System.out.println(data[i].id + " " + data[i].ans + " " + data[i].time);
			}
		}
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}