import java.util.*;

public class Main {
	public static void main(String[] args) {
		class Combo {
			String name;
			long time;
		}
		
		Queue<Combo> remain = new LinkedList<Combo>();		
		Scanner scanner = new Scanner(System.in);
		
		long n = scanner.nextLong();
		long q = scanner.nextLong();
				
		for (int i = 0; i < n; i ++) {
			Combo process = new Combo();
			process.name = scanner.next();
			process.time = scanner.nextLong();
			remain.add(process);
		}
		scanner.close();
		

		long GlobeTime = 0;
		
		while (remain.size() > 0) {
			Combo currentProcess = remain.remove();
			
			if (currentProcess.time <= q) {
				GlobeTime += currentProcess.time;
				System.out.println(currentProcess.name + " " + GlobeTime);
			} else {
				currentProcess.time -= q;
				GlobeTime += q;
				remain.add(currentProcess);
			}
		}
		
	}
} 
