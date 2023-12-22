import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int sum = 0;
		int capacity;
		boolean flg = true;
		final int baggage = scan.nextInt();
		final int truck = scan.nextInt();
		final int[] weight= new int[baggage];
		
		
		for (int i = 0; i < baggage; i++) {
			weight[i] = scan.nextInt();
			sum += weight[i];
		}
		scan.close();
		capacity = sum / truck;
		
		while (flg) {
			int starttruck = 0;
			for ( int car = 0; car < truck; car++) {
				int sumweight = 0;
				for (int bag = starttruck; bag < baggage; bag++) {
					sumweight += weight[bag];
					if ( sumweight > capacity) {
						starttruck = bag;
						break;
					} else if (car == truck - 1 && bag == baggage - 1) {
						flg = false;
					}
				}
			}
			if ( flg == true) capacity++;
		}
		
		System.out.println(capacity);
		
	}
}

