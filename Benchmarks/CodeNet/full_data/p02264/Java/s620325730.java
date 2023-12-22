import java.util.Scanner;
import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<String> processes = new LinkedList<>();
		int numProcesses = scanner.nextInt();
		int quantum = scanner.nextInt();
		int timestamp = 0;
		String result = "";
		//get all processes from scanner
		scanner.nextLine();
		for (int i = 0; i < numProcesses; i++) {
			processes.add(scanner.nextLine());
		}
		scanner.close();
		
		while (!processes.isEmpty()) {
			//parse process
			String[] process = processes.remove().split(" ");
			String name = process[0];
			int timeLeft = Integer.parseInt(process[1]);
			
			//decrement time left and add back to queue if necessary
			if (timeLeft-quantum > 0) {
				processes.add(name + " " + (timeLeft-quantum));
				timestamp += quantum;
			}
			else {
				timestamp += timeLeft;
				System.out.println(name + " " + (timestamp));
			}
		}
	}
}
