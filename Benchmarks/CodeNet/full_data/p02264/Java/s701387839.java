import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] nAndQuantum = new String[2];
		nAndQuantum = input.nextLine().split(" ");
		int n = Integer.parseInt(nAndQuantum[0]);
		int quantum = Integer.parseInt(nAndQuantum[1]);
		Queue<Integer> times = new LinkedList<Integer>();
		Queue<String> names = new LinkedList<String>();
		String[] nameAndTime = new String[2];
		for(int i = 0; i < n; i++) {
			nameAndTime = input.nextLine().split(" ");
			names.add(nameAndTime[0]);
			times.add(Integer.parseInt(nameAndTime[1]));
			
		}
		int totalTime = 0;
		while(!times.isEmpty() && !names.isEmpty()) {
			String name;
			int time;
			if(times.peek() > quantum) {
				time = times.poll();
				totalTime = totalTime + quantum;
				name = names.poll();
				time = time - quantum;
				times.add(time);
				names.add(name);
				
			}
			else if(times.peek() <= quantum) {
				time = times.poll();
				totalTime = totalTime + time;
				name = names.poll();
				System.out.println(name + " " + totalTime);
				
			}
			
		}

	}

}
