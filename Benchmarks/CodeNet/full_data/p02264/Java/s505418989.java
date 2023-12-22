import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Queue;
class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] t = scan.nextLine().split("\\s");
		int num = Integer.parseInt(t[0]);
		int Dectime = Integer.parseInt(t[1]);
		
		Queue<Process> queue = new ArrayDeque<Process>();
		for(int i = 0; i < num; i++){
			String[] str = scan.nextLine().split("\\s");
			
			Process pro = new Process(str[0], Integer.parseInt(str[1]));
			queue.offer(pro);
		}
		
		int result = 0;
		
		while(queue.size() > 0){
			Process pro = queue.poll();
				
			result += Dectime;
			
			if((pro.time = pro.time - Dectime) > 0){
				queue.offer(pro);
			}else{
				result += pro.time;
				System.out.println(pro.name + " " + result);
			}
			
		}
	}
}

class Process{
	String name = null;
	int time = 0;
	
	Process(String n, int t){
		this.name = n;
		this.time = t;
	}
}