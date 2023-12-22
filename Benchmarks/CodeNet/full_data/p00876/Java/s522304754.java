import java.util.*;

public class Main{
	
	ArrayList<LinkedList<P>> data;
	
	class P implements Comparable<P>{
		int time,lap, lest, nowlane;
		public P(int time, int lap) {
			this.time = time;
			this.lap = lap * 2;
			this.lest = time;
			this.nowlane = 0;
		}
		@Override
		public String toString() {
			return "P [time=" + time + ", lap=" + lap + ", lest=" + lest
					+ ", nowlane=" + nowlane + "]";
		}
		@Override
		public int compareTo(P o) {
			return this.time - o.time;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			data = new ArrayList<LinkedList<P>>();
			for(int i = 0; i < 2; i++){
				data.add(new LinkedList<P>());
				if(i == 0){
					for(int j = 0; j < n; j++){
						int t = sc.nextInt(), l = sc.nextInt();
						data.get(i).add(new P(t, l));
					}
				}
			}
			
			int nowtime = 1;
			int count = 0;
			for(nowtime = 1;; nowtime++){
				
				ArrayList<ArrayList<P>> temp = new ArrayList<ArrayList<P>>();
				for(int i = 0; i < 2; i++){
					temp.add(new ArrayList<Main.P>());
				}
				
				for(int i = 0; i < 2; i++){
					for(int j =0;j <  data.get(i).size(); j++){
						data.get(i).get(j).lest--;
						if(data.get(i).get(j).lest <= 0 && j == 0){
							data.get(i).get(0).lap--;
							data.get(i).get(0).nowlane ^= 1;
							data.get(i).get(0).lest = data.get(i).get(0).time;
							P now = data.get(i).remove(0);
							j--;
							if(now.lap == 0){
								count++;
							}
							else{
								temp.get(i ^ 1).add(now);
							}
						}
					}
				}
				
				for(ArrayList<P> a: temp){
					Collections.sort(a);
				}
				for(int i = 0; i < 2; i++){
					for(int j = 0; j < temp.get(i).size(); j++){
						data.get(i).add(temp.get(i).get(j));
					}
				}
				
				//debug
//				System.out.println("time = " + nowtime + " count = " + count);
//				for(int i = 0; i < 2; i++){
//					System.out.println("i = " + i);
//					System.out.println(data.get(i));
//				}
				
				//end cond
				if(count >= n){
					break;
				}
			}
			System.out.println(nowtime);
		}
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}