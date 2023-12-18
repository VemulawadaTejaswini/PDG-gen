import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 ArrayList<Work> work = new ArrayList<>(N);
		 
		 for (int i = 0; i < N; i++ ) {
			 work.add(new Work(scan.nextInt(),scan.nextInt()));
		 }
		 
		 Collections.sort(work);
		 
		 String result_msg = "Yes";
		 int used_working_time = 0;
		 for (int i = 0; i < N; i++ ) {
			 if (work.get(i).dead_line - used_working_time < work.get(i).amount_work) {
				 result_msg = "No";
				 break;
			 }
			 used_working_time += work.get(i).amount_work;
		 }
		 
		 System.out.println(result_msg);
		 
		 scan.close();
		 
	}
	
	static class Work implements Comparable<Work> {
		int amount_work;
		int dead_line;
		
		public Work(int a, int d) {
			amount_work = a;
			dead_line = d;
		}
		
		@Override
		public int compareTo(Work w) {
			return this.dead_line - w.dead_line;
		}
	}

}
