import java.io.*;

class Main{
	private Node first, last;

	public Main(){
		int n, limit = 0, timeSt = 0;
		String[] tmp;
		Node[] process;

		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in), 1);
		try{
			tmp = br.readLine().split(" ");
			n = Integer.parseInt(tmp[0]);
			limit = Integer.parseInt(tmp[1]);
			process = new Node[n];

			for(int i=0; i < n; i++){
				tmp = br.readLine().split(" ");
				process[i] = 
					new Node(tmp[0], Integer.parseInt(tmp[1]));
				enqueue(process[i]);
			}

		}catch(IOException e){
			System.out.println(e);
		}
		Node node = null;
		while( (node = dequeue()) != null){
			if( node.getTime() <= limit){
				timeSt += node.getTime(); 
				System.out.println(node+" "+timeSt);
			}else{
				timeSt += limit;
				int t = node.getTime();
				node.setTime(t - limit);
				enqueue(node);
			}
		}
	}

	void enqueue(Node p){
		if(first == null){
			last = p;
			first = last; 
		} else{
			last.next = p;
			last = last.next;
		}
	}
	Node dequeue(){
		if(first != null){
			Node tmp = first;
			first = first.next;
			tmp.next = null;
			return tmp;
		}
		return null;
	}

	void printQueue(){
		Node n = first;
		while(n != null){
			System.out.println(n);
			n = n.next;
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}

class Node{
	private String name;
	private int time;
	Node next;

	Node(String name, int time){
		this.name = name;
		this.time = time;
	}
	int getTime(){
		return this.time;
	}
	void setTime(int time){
		this.time = time;
	}
	void setNext(Node n){
		next = n;
	}
	@Override
	public String toString(){
		return name;
	}
}