import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n, q, time, i;
		queue que = new queue();
		
		n = sc.nextInt();
		q = sc.nextInt();
		
		for(i = 0; i < n; i++){
			String name = new String(sc.next());
			time = sc.nextInt();
			
			que.enqueue(name, time);
		}
		
		que.simulate(q);
	}
}

class data{
	String name;
	int time;
	
	data(String name, int time){
		this.name = name;
		this.time = time;
	}
}

class queue{
	ArrayList<data> Q;
	int head, tail;
	
	queue(){
		Q = new ArrayList<data>();
		head = tail = 0;
	}
	
	void enqueue(String name, int time){
		data process = new data(name, time);
		
		Q.add(process);
		tail ++;
	}
	
	data dequeue(){
		data process = Q.get(head);
		
		head ++;
		
		return process;
	}
	
	boolean isEmpty(){
		if(head == tail){
			return true;
		}
		else{
			return false;
		}
	}
	
	void simulate(int q){
		int sum = 0, cnt = 0, t;
		ArrayList<data> finish = new ArrayList<data>();
		
		while(!isEmpty()){
			data temp = dequeue();
			if(temp.time <= q){
				sum += temp.time;
				temp.time = sum;
				finish.add(temp);
				
				cnt ++;
			}
			else{
				sum += q;
				enqueue(temp.name, temp.time - q);
			}
		}
		
		for(int i = 0; i < cnt; i++){
			System.out.println(finish.get(i).name.toString() + " " + finish.get(i).time);
		}
	}
}