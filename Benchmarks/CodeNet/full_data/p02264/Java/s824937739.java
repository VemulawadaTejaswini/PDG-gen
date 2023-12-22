import java.util.Scanner;

class Work {
	String name;
	int time;
	
	Work(String n,int t){
		name=n;  time=t;
	}
	
}

class Queue {
	int head;
	int tail;
	Work[] a;
	
	/*コンストラクタ*/
	Queue(int n){
		head=0; tail=-1; a=new Work[n];
	}
	
	void enqueue(Work x,int n){
		tail=(tail+1)%n;
		a[tail]=x;
	}
	
	Work dequeue(int n){
		Work temp=a[head];
		head=(head+1)%n;
		return temp;
	}
	
	void decrease(int t){
		a[head].time-=t;
	}
	
	int getTime(){
		return a[head].time;
	}
	
	String getName(){
		return a[head].name;
	}
	
}

class Main {
	
	static void solve(Queue Q,int n,int q,int sum){
		int time=0;
		Work temp;
		
		while(time != sum){
			if(Q.getTime() == q){
				time+=q;
				System.out.println(Q.getName() + " " + time);
				temp=Q.dequeue(n);
			}
			else if(Q.getTime() < q){
				time+=Q.getTime();
				System.out.println(Q.getName() + " " + time);
				temp=Q.dequeue(n);
			}
			else {
				time+=q;
				Q.decrease(q);
				temp=Q.dequeue(n);
				Q.enqueue(temp,n);
			}
		}
		
		return;
	}
		
	
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int q=scan.nextInt();
		int sum=0;
		Queue Q=new Queue(n);
		
		for(int i=0;i<n;i++){
			Work temp=new Work(scan.next(),scan.nextInt());
			Q.enqueue(temp,n);
			sum+=temp.time;
		}
		
		solve(Q,n,q,sum);
		
	}
}
