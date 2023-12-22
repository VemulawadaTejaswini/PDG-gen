import java.util.Scanner;

public class Main {
	static Process[] stack;
	static int firstPointer = 0;
	static int lastPointer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int processNum = sc.nextInt();
		int quanTime = sc.nextInt();
		stack  = new Process[processNum + 1];
		for(int i = 0; i < processNum; i++) {
			Process process = new Process(sc.next(), sc.nextInt());
			stack[i] = process;
		}
		sc.close();
		lastPointer = processNum - 1;
		int time = 0;
		Process[] answerProcesses = new Process[processNum];
		int answerProcessesIndex = 0;
		while(stack[firstPointer] != null) {
			Process process = dequene();
			int processTime = process.time;
			if(processTime <= quanTime) {
				time += processTime;
				process.time = time;
				answerProcesses[answerProcessesIndex] = process;
				answerProcessesIndex++;
			} else {
				time += quanTime;
				process.time -= quanTime;
				enquene(process);
			}
		}
		for(Process process: answerProcesses) {
			System.out.println(process.name + " " + process.time);
		}
	}
	public static void enquene(Process process) {
		if(lastPointer == stack.length - 1) {
			lastPointer = 0;
		} else {
			lastPointer++;
		}
		stack[lastPointer] = process;
	}
	public static Process dequene() {
		Process process = stack[firstPointer];
		stack[firstPointer] = null;
		if(firstPointer == stack.length - 1) {
			firstPointer = 0;
		} else {
			firstPointer++;
		}
		return process;
	}
}
class Process {
	String name;
	int time;
	public Process(String name, int time) {
		this.name = name;
		this.time = time;
	}
}