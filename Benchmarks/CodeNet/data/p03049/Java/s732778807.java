
import java.util.Scanner;

class Main {
	public static void main (String[] arg) {
		int N;
		int counter = 0;
		int endAcounter = 0;
		int startBconter = 0;
		int sBeA = 0;
		String AB = "AB";
		String A = "A";
		String B = "B";
		String lookStr = "";

		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		String[] strs = new String[N];

		for (int i = 0; i < N; i++) {
			lookStr = scanner.next();
			strs[i] = lookStr;
			if (lookStr.contains(AB)) {
				counter++;
			}
			if (lookStr.endsWith(A) && lookStr.startsWith(B)) {
				sBeA++;
			}

			if(lookStr.endsWith(A)) {
				endAcounter++;
			}
			if (lookStr.startsWith(B)) {
				startBconter++;
			}
		}
		scanner.close();

		if (endAcounter == 0 && startBconter == 0) {
			counter += sBeA - 1;
			System.out.println(true);

		} else {
			counter += Math.min(endAcounter, startBconter);
		}


		System.out.println(counter);
	} 
}