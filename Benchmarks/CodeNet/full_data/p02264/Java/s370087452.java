import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		Queue<DataS> queue = new ArrayDeque<>();
		int n = scan.nextInt();
		int q = scan.nextInt();
		for (int i = 0; i < n ; i++) {
			String name = scan.next();
			int time = scan.nextInt();
			DataS dataS = new DataS( name, time );
			queue.add(dataS);
		}

		int time = 0;
		while(queue.size() != 0) {
			DataS dataS = queue.poll();
			int dataTime = dataS.getTime();
			if(dataTime > q) {
				time += q;
				dataS.setTime(dataTime - q);
				queue.add(dataS);
			}else {
				time += dataS.getTime();
				System.out.println(dataS.getName() + " " + time);
			}
		}

	}

	static class DataS{
		private String name;
		private int time;
		public DataS(String name , int time) {
			this.name = name;
			this.time = time;
		}
		public String getName() {
			return name;
		}

		public void setTime(int time) {
			this.time = time;
		}

		public int getTime() {
			return time;
		}
	}

}

