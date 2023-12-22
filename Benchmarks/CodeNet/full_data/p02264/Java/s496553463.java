import java.util.*;
class Processe{
	String processesName;
	int Times;
	int endtime;
}
public class Main{
	public static void main(String[] args){
		Queue<Processe> queue = new  LinkedList<Processe>();
		Queue<Processe> queue2 = new  LinkedList<Processe>();
		int n;
		int q;
		int endtime = 0;
		Scanner scanner = new Scanner(System.in);
		String string;
		string = scanner.nextLine();
		
		String [] strings = string.split(" ");
		n = Integer.parseInt(strings[0]);
		q= Integer.parseInt(strings[1]);
		
		Processe[] processes = new Processe [n];
		
		Processe processe  = new Processe();
		
		for(int i=0; i<n; i++){
			string = scanner.nextLine();
			strings = string.split(" ");
			processes[i] = new Processe();
			processes[i].processesName = strings[0];
			processes[i].Times = Integer.parseInt(strings[1]);
			queue.add(processes[i]);
		}
		while(!queue.isEmpty()){
			processe = queue.poll();
			if(processe.Times <= q){
				endtime += processe.Times;
				processe.endtime = endtime;
				queue2.add(processe);
			}else{
				endtime  += q;
				processe.Times -= q;
				queue.add(processe);
			}
		}
		while(!queue2.isEmpty()){
			processe = queue2.poll();
			System.out.println(processe.processesName + " " + processe.endtime);
		}
	}
}