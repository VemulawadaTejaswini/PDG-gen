import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			String s = sc.next();
			char[] sChar = s.toCharArray();


			int rCount = 0;
			int gCount = 0;
			int bCount = 0;
			for(int i = 0 ; i < n ; i++ ) {
				if ( sChar[i] == 'R' ) rCount++;
				if ( sChar[i] == 'G' ) gCount++;
				if ( sChar[i] == 'B' ) bCount++;
			}

			long diff = 0;
			for(int step = 1 ; step <= n / 2; step++ ) {


				//initial position
				for(int init = 1 ; init <= step ; init++ ) {

					//check
					diff += countDiff(init, step, sChar, n);
				}
			}
		
			System.out.println(rCount*gCount*bCount);
			System.out.println(rCount*gCount*bCount - diff);

		}
	}

	private static long countDiff(int init, int step, char[] sChar, int n) {

		int current = init;
		long count = 0;
		while (current + 2*step <= n) { 

			char v1 = sChar[current-1];
			char v2 = sChar[current-1 + step];
			char v3 = sChar[current-1 + step * 2];
			
			//check
			if ( v1 != v2 && v2 != v3 && v3 != v1 ) {
				count++;
			}
			
			current += step;
		}
		
		return count;

	}

}