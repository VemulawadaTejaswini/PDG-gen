import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static class Packet implements Comparable<Packet>{
		long time;
		int source, dest;

		public Packet(long time, int source, int dest) {
			super();
			this.time = time;
			this.source = source;
			this.dest = dest;
		}

		@Override
		public int compareTo(Packet arg0) {
			if(this.time < arg0.time){
				return -1;
			}else if(this.time > arg0.time){
				return 1;
			}else{
				return 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if (n == 0 && m == 0) {
				break;
			}
			
			boolean[] is_infected = new boolean[n];
			is_infected[0] = true;
			
			Packet[] packets = new Packet[m];
			
			for(int i = 0; i < m; i++){
				packets[i] = new Packet(sc.nextLong(), sc.nextInt() - 1, sc.nextInt() - 1); 
			}
			
			Arrays.sort(packets);
			
			int count = 1;
			for(int i = 0; i < m; i++){
				if(is_infected[packets[i].source]){
					is_infected[packets[i].dest] = true;
					count++;
				}
			}
			
			System.out.println(count);
		}

	}

}