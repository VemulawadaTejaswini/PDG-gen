import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int t, p, r;
	static int[] ac, time;
	static int[][] wa;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}

	static boolean read(){
		t = sc.nextInt();
		p = sc.nextInt();
		r = sc.nextInt();
		if(t == 0 && p == 0 && r == 0)return false;
		wa = new int[t+1][p+1];
		ac = new int[t+1];
		time = new int[t+1];
		for(int i = 0; i < r; i++){
			int tId = sc.nextInt();
			int pId = sc.nextInt();
			int submitTime = sc.nextInt();
			String status = sc.next();
			if(status.equals("WRONG")){
				wa[tId][pId]++;
			}else{
				ac[tId]++;
				time[tId] += wa[tId][pId]*1200 + submitTime;
			}
		}
		return true;
	}
	
	static void solve(){
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(t, new Comparator<Integer>(){
			public int compare(Integer obj1, Integer obj2){
				if(ac[obj1] != ac[obj2]){
					return ac[obj2] - ac[obj1];
				}else if(time[obj1] != time[obj2]){
					return time[obj1] - time[obj2];
				}else{
					return obj1 - obj2;
				}
			}
		});
		for(int i = 1; i <= t; i++){
			q.add(i);
		}
		while(!q.isEmpty()){
			int id = q.poll();
			System.out.println(id + " " + ac[id] + " " + time[id]);
		}
	}
}