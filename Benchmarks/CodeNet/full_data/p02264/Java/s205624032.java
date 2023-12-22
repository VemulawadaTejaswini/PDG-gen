import java.util.*;

public class Main {
	public static void main(String[] args) {
		class Process {
			private String name;
			private long time;
		}
		Queue<Process> queue = new LinkedList<Process>();		
		Scanner scanner = new Scanner(System.in);
		
		long n = scanner.nextLong();
		long q = scanner.nextLong();
				
		for (int i = 0; i < n; i ++) {
			Process process = new Process();
			process.name = scanner.next();
			process.time = scanner.nextLong();
			queue.add(process);
		}
		scanner.close();

		long currentTime = 0;
		
		while (queue.size() > 0) {
			Process currentProcess = queue.remove();
			
			if (currentProcess.time <= q) {
				currentTime += currentProcess.time;
				System.out.println(currentProcess.name + " " + currentTime);
			} else {
				currentProcess.time -= q;
				currentTime += q;
				queue.add(currentProcess);
			}
		}
	}
} 

