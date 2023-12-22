import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException, NumberFormatException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Pair> deq = new ArrayDeque<Pair>();
		
		String[] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);
		
		
		for(int i = 0; i < n; i++){
			str = br.readLine().split(" ");
			deq.addFirst(new Pair(str[0], Integer.parseInt(str[1])));
		}
		
		int timeCount = 0;
		
		String[] name = new String[n];
		int[] time = new int[n];
		
		for(int i = 0; !deq.isEmpty();){
			
			Pair p = deq.removeLast();
			
			if(p.getTime() > q){
				p.overTime(q);
				deq.addFirst(p);
				timeCount += q;
			} else {
				timeCount += p.getTime();
				
				name[i] = p.getName();
				time[i] = timeCount;
				i++;
			}
		}
		
		for(int i = 0; i < n; i++){
			System.out.println(name[i] + " " + time[i]);
		}
	}

}

class Pair {
	String name;
	int time;
	
	Pair(String name, int time){
		this.name = name;
		this.time = time;
	}
	
	void overTime(int over){
		time -= over;
	}
	int getTime(){
		return time;
	}
	String getName(){
		return name;
	}
}