import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		Queue<Data> queue = new ArrayDeque<Data>();
		for(int i = 0; i < n; i++) {
			Data d = new Data(scan.next(), scan.nextInt());
			queue.add(d);
		}
		scan.close();
		StringBuilder sb = new StringBuilder();
		int time = 0;
		while(queue.size() != 0) {
			Data d = queue.poll();
			if(q >= d.getTime()) {
				time += d.getTime();
				if(queue.size() == 0) {
					sb.append(d.getName() + " " + time);
				}else {
					sb.append(d.getName() + " " + time + "\n");
				}

			}else {
				time += q;
				int res = d.getTime() - q;
				d.setTime(res);
				queue.add(d);
			}
		}
		System.out.println(sb.toString());
	}
}

class Data{
	String name;
	int time;
	public Data(String name, int time) {
		this.name = name;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}

