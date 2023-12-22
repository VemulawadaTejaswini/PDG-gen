import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
	private static int timer = 0;

	public static void processor(Queue<Process> p, int q){
		Process x;
		timer = 0;
		while(!p.isEmpty()){
			x = p.remove();
			if(!x.handle(q)) p.add(x);
		}
	}	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int quantum = sc.nextInt();

		Queue<Process> p = new LinkedList<Process>();
		String name;
		int time;
		for(int i=0; i<n; i++){
			name = sc.next();
			time = sc.nextInt();
			Process x = new Process(name, time);
			p.add(x);
		}

		sc.close();

		processor(p,quantum);
	}

	private static class Process{
		String name;
		int time; //remaining time

		public Process(String n, int t){
			name = n;
			time = t;
		}

		//return if it ends
		public boolean handle(int q){
			if(q<time){
				time -= q;
				timer +=q;
				return false;
			} 
			else{
				timer += time;
				System.out.println(name+" "+timer);
				return true;
			}
		}
	}
}
