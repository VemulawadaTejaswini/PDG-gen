import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] initial = scan.nextLine().split(" ");
	int n = Integer.parseInt(initial[0]);
	int q = Integer.parseInt(initial[1]);
	MyQueue processes = new MyQueue(n);
	for (int i = 0; i < n; i++) {
	    String[] input = scan.nextLine().split(" ");
	    String name = input[0];
	    int time = Integer.parseInt(input[1]);
	    Process p = new Process(name, time);
	    processes.enqueue(p);
	}
	
	int processTime = 0;
	while (!processes.isEmpty()) {
	    Process p = processes.dequeue();
	    if (p.time > q) {
		processTime += q;
	    } else {
		processTime += p.time;
	    }
	    p.time = p.time - q;
	    if (p.time > 0) {
		processes.enqueue(p);
	    } else {
		System.out.println(p.name + " " + processTime);
	    }
	}
    }
    
}
class Process {
    String name;
    int time;
    Process (String name, int time) {
	this.name = name;
	this.time = time;
    }
}
class MyQueue {
    int top;
    Process[] processes;
    MyQueue (int n) {
	processes = new Process[n];
	top = -1;
    }
    void enqueue (Process p) {
	processes[++top] = p;
    }
    Process dequeue () {
	Process p = processes[0];
	for (int i = 0; i < top; i++) {
	    processes[i] = processes[i+1];
	}
	processes[top--] = null;
	return p;
    }
    boolean isEmpty () {
	return top == -1;
    }
}