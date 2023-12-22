import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int students;
		double total = 0.0;
		double average = 0.0;
		double var = 0.0;
		
		do {
			students = scan.nextInt();
			
			if (students == 0) break;
			
			total = 0.0;
			var = 0.0;
			int point[] = new int[students];
			
			for (int i = 0; i < students; i++) {
				point[i] = scan.nextInt();
				total += (double)point[i];
			}
			
			average = total / (double)students;
			
			for (int i = 0; i < students; i++) {
				var += ((point[i] - average) * (point[i] - average));
			}
			
			System.out.println(Math.sqrt((var / students)));
			
		} while (scan.hasNext());
		
		scan.close();
	}
}

