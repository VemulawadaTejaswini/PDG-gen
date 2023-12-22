import java.util.*;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);
		Record[][] recordArray = new Record[3][8];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 8; j++) {
				recordArray[i][j] = new Record (scan.nextInt() , scan.nextDouble());
			}
		}
		
		for (int i = 0; i < 3; i++) {
			Arrays.sort(recordArray[i]);
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(recordArray[i][j].number + " " + recordArray[i][j].time);
			}
		}
		
		Record[] record = new Record[6];
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j < 4; j++) {
				record[i * 2 + (j - 2)] = recordArray[i][j];
			}
		}
		
		Arrays.sort(record);
		
		System.out.println(record[0].number + " " + record[0].time);
		System.out.println(record[1].number + " " + record[1].time);
		
		
	}

	public static void main(String[] args) {
		new Main().run();
	}
	
	public class Record implements Comparable<Record>{
		int number;
		double time;
		
		public Record(int number, double time) {
			this.number = number;
			this.time = time;
		}
		
		@Override
		public int compareTo(Record o) {
			if (time < o.time) {
				return -1;
			}else if (time > o.time) {
				return 1;
			}else {
				return 0;
			}
		}
	}

}