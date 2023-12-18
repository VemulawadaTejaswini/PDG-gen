import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int ab[][] = new int[n][2];
		
		for ( int i = 0; i < n; i++ ) {
			ab[i][0] = in.nextInt();
			ab[i][1] = in.nextInt();
		}
		Arrays.sort(ab, (a, b) -> Integer.compare(a[0], b[0]));
		
		long earn = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for ( int[] i : ab ) {
			if(i[0] > m) {
				continue;
			}
			
			if(map.containsKey(i[0])) {
				map.put(i[0], Math.max(map.get(i[0]), i[1]));
			}
			else {
				map.put(i[0], i[1]);
			}
			// System.out.println(i[0] + " " + i[1]);
		}
		
		for ( Entry<Integer, Integer> en : map.entrySet() ) {
			earn +=  en.getValue();			
		}
		
		System.out.println(earn);

		in.close();
	}
}