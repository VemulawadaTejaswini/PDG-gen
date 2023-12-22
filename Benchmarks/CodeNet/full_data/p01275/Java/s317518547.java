import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	class si implements Comparable<si>{
		String data;
		int time;
		si(String d,int t){
			data = d;
			time = t;
		}
		
		public int compareTo(si tar){
			return this.time - tar.time;
		}
	}
	
	public void run() {
		for (;;) {
			int n  = sc.nextInt();
			if(n == 0 ){
				break;
			}
			String a = sc.next();
			String b = sc.next();
			
			HashMap<String,Integer> hm = new HashMap<String,Integer>();
			TreeSet<Long> used = new TreeSet<Long>();
			
			PriorityQueue<si> q = new PriorityQueue<si>();
			
			q.add(new si(a,0));

			char goal[] = b.toCharArray();

			for(;;){
				if(q.isEmpty()){
					System.err.println("err");
				}
				
				si s = q.poll();
				
				String st =  s.data;
				if(st.equals(b)){
					System.out.println(s.time);
					break;
				}
				int pt = s.time;
				
				
				for(int from = 0; from < n; from++){
					char temp[] = st.toCharArray();
					if(temp[from]== goal[from])
					{
						continue;
					}
					int diff = goal[from] - temp[from];
					temp[from] += diff;
					if(temp[from] < '0'){
						temp[from] += 10;
					}
					if(temp[from] > '9'){
						temp[from] -= 10;
					}
					q.add(new si(String.valueOf(temp) , pt+1));
					for(int to = from+1; to < n ; to++){
						temp[to] += diff;
						if(temp[to] < '0'){
							temp[to] += 10;
						}
						if(temp[to] > '9'){
							temp[to] -= 10;
						}
						q.add(new si(String.valueOf(temp) , pt+1));						
					}					
				}
			}
			
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}