import java.util.*;

class MyComp implements Comparator<Pair> {

	public int compare(Pair arg0, Pair arg1) {
		Pair t0 = (Pair) arg0;
		Pair t1 = (Pair) arg1;
		if(t0.time > t1.time) {
			return -1;
			
		}
		else if(t0.time < t1.time) {
			return 1;
		}
		else {
			if(t0.id > t1.id) {
				return 1;
			}
			else if(t0.id < t1.id) {
				return -1;
			}
			else {
				return 0;
			}
		}
		
	}
	
}


class Pair {
	int id;
	int time;
	public Pair(int d, int t) {
		this.id = d;
		this.time = t;
	}
	public Pair(Pair a) {
		this.id = a.id;
		this.time = a.time;
	}
	
}

public class Main {


	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		
		PriorityQueue <Pair> queA = new PriorityQueue <Pair>(11,new MyComp());
		PriorityQueue <Pair> queBX = new PriorityQueue <Pair>(11,new MyComp());
		
		int N = stdIn.nextInt();
		int R = stdIn.nextInt();
		int L = stdIn.nextInt();
		
		int[] time = new int[N];
		
		int lastTime = 0;
		queA.add(new Pair(1,0));
		
		for(int i = 0; i < R; i++) {
			
			int d = stdIn.nextInt();
			int t = stdIn.nextInt();
			int x = stdIn.nextInt();
			time[queA.peek().id-1] += t - lastTime;
			boolean atta = false;
			while(!queA.isEmpty()) {
				
				Pair tmp = queA.poll();
				
				if(tmp.id == d) {
					atta = true;
					tmp.time +=  x;
					queBX.offer(tmp);
					break;
				}
				else {
					queBX.offer(tmp);
				}
			}
			
			if(!atta) {
				queBX.offer(new Pair(d,x));
			}
				
			while(!queBX.isEmpty()) {
				queA.offer(queBX.poll());
			}
			

			lastTime = t;
				
		}
		
		time[queA.peek().id-1] += L - lastTime;
		
		int timeA = 0;
		int idA = 0;
		for(int i = 0; i < time.length; i++) {
			if(timeA < time[i]) {
				timeA = time[i];
				idA = i;
			}
		}
		
		System.out.println(idA+1);
		
	}
	


}