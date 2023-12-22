import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			Deque<Process> process=new ArrayDeque<>();
			int n=Integer.parseInt(sc.next());
			int q=Integer.parseInt(sc.next());
			for(int i=0;i<n;i++){
				String name=sc.next();
				int time=Integer.parseInt(sc.next());
				process.addLast(new Process(name,time));
			}
			int totalTime=0;
			while(process.size()!=0){
				Process p = process.pollFirst().clone();
				if(p.isEnds(q)){
					totalTime+=p.time;
					System.out.println(p.name+" "+totalTime);
				}else{
					totalTime+=q;
					p.work(q);
					process.addLast(p);
				}
			}
		}
	}
}

class Process implements Cloneable{
	String name;
	int time;
	Process(String name, int time){
		this.name=name;
		this.time=time;
	}
	public Process clone(){
		Process p = new Process(this.name,this.time);
		return p;
	}
	public boolean isEnds(int q){
		return (this.time<=q);
	}
	public void work(int q){
		this.time-=q;
	}
}