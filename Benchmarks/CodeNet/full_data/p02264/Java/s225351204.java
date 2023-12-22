import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] initial = scan.nextLine().split(" ");
	int n = Integer.parseInt(initial[0]);
	int q = Integer.parseInt(initial[1]);
	ArrayList<Process> processes = new ArrayList<Process>();
	for (int i = 0; i < n; i++) {
	    String[] input = scan.nextLine().split(" ");
	    String name = input[0];
	    int time = Integer.parseInt(input[1]);
	    Process p = new Process(name, time);
	    processes.add(p);
	}
	
	int processTime = 0;
	while (!processes.isEmpty()) {
	    Process p = processes.remove(0);
	    if (p.time > q) {
		processTime += q;
	    } else {
		processTime += p.time;
	    }
	    p.time = p.time - q;
	    if (p.time > 0) {
		processes.add(p);
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