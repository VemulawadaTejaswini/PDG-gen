import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Process {
	String name;
	int time;
	
	Process(String name, int time) {
		this.name = name;
		this.time = time;
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new FileReader("in1.txt"));
		String[] line1 = br.readLine().split(" ");
		int n = Integer.parseInt(line1[0]), q = Integer.parseInt(line1[1]);
		Deque<Process> que = new ArrayDeque<Process>();
		for (int i = 0; i < n; i++) {
			String[] line = br.readLine().split(" ");
			que.addLast(new Process(line[0], Integer.parseInt(line[1])));
		}
		
		StringBuilder sb = new StringBuilder();
		int timeStamp = 0;
		while (!que.isEmpty()) {
			Process p = que.removeFirst();
			if (p.time <= q) {
				timeStamp += p.time;
				sb.append(p.name);
				sb.append(' ');
				sb.append(timeStamp);
				sb.append('\n');
			} else {
				timeStamp += q;
				p.time -= q;
				que.addLast(p);
			}
		}
		
		System.out.print(sb.toString());
	}
}