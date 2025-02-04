import java.io.*;
import java.util.*;

class Copy_2_of_Main {
	final static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));
	final static StringBuilder out = new StringBuilder();
	public static void main(String[] Args) throws IOException {
		Queue<Process> p = new ArrayDeque<Process>();
		Process work;
		int elapse = 0;
		String[] C1 = br.readLine().split("\\s+");
		int n = Integer.parseInt(C1[0]);
		int q = Integer.parseInt(C1[1]);
		for (int i = 0; i < n; i++) {
			work = new Process(br.readLine());
			p.add(work);
		}
		while ((work = p.poll()) != null) {
			if (work.time <= q) {
				elapse += work.time;
				out.append(work.name).append(' ' ).append(elapse).append('\n');
			} else {
				work.time -= q;
				elapse += q;
				p.add(work);
			}
		}
		System.out.println(out);
	}
}

class Process {
	String name;
	int time;
	public Process(String str) {
		String[] in = str.split("\\s+");
		name = in[0];
		time = Integer.parseInt(in[1]);
	}
	public Process(String name, int time) {
		this.name = name;
		this.time = time;
	}
}