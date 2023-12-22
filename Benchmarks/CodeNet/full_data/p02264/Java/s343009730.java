import java.util.Scanner;

class Process{
	int time;
	String name;
	public Process(String name,int time){
		this.time = time;
		this.name = name;
	}
}

class Queue{
	private Process[] queArray;
	private int front;
	private int rear;
	private int maxSize;
	private int nItems;
	
	public Queue(int size){
		maxSize = size;
		queArray = new Process[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	public void insert(Process p){
		if(rear == maxSize -1) rear = -1;
		queArray[++rear] = p;
		nItems++;
	}
	public Process remove(){
		Process temp = queArray[front++];
		if(front == maxSize) front = 0;
		nItems--;
			return temp;
	}
	public boolean isEmpty(){
		//return (rear+1==front || (front+maxSize-1==rear));
		return (nItems == 0);
	}
}

 class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		Queue que = new Queue(n);
		int finTime = 0;
		for(int i = 0;i<n;i++){
			que.insert(new Process(in.next(),in.nextInt()) );
		}
		
		while(!que.isEmpty()){
			Process remove = que.remove();
			int c = Math.min(q, remove.time);
			remove.time -= c;
			finTime += c;
			if(remove.time>0){
				que.insert(remove);
			}else{
				System.out.println(remove.name+ " " +finTime);
			}
	}

	}
}