import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arrivals = new int[100];
		int[] seats = new int[17];
		int[] end_seats = new int[17];
		int[] wait = new int[100];
		Arrays.fill(seats, -1);
		Arrays.fill(end_seats, -1);

		for (int i = 0; i < 100; i++) {
			arrivals[i] = 5 * i;
		}

		int porpos = 0;
		END: for (int time = 0;; time++) {
			
			for (int i = 0; i < 17; i++) {
				if (seats[i] != -1 && end_seats[i] <= time) {
					seats[i] = -1;
				}
			}
			
			LOOP:while (arrivals[porpos] <= time) {
				
				//System.out.println(porpos);
				
				boolean f_fount = false;
				for (int i = 0; i <= 17 - (porpos % 5 == 1 ? 5 : 2); i++) {
					boolean found = true;
					for (int j = 0; j < (porpos % 5 == 1 ? 5 : 2); j++) {
						if (seats[i + j] != -1) {
							found = false;
							break;
						}
					}

					if (found) {
						f_fount = true;
						
						for (int j = 0; j < (porpos % 5 == 1 ? 5 : 2); j++) {
							seats[i + j] = porpos;
							end_seats[i + j] = time + 17 * (porpos % 2) + 3
									* (porpos % 3) + 19;
							wait[porpos] = time - arrivals[porpos];

						}
						if (porpos == 99) {
							break END;
						}

						porpos++;
						break;
					}
				}
				
				if(!f_fount){
					break;
				}
			}
			
			//System.out.println("time = " + time + " : " + Arrays.toString(seats));
		}

		while (sc.hasNext()) {
			System.out.println(wait[sc.nextInt()]);
		}
	}

}