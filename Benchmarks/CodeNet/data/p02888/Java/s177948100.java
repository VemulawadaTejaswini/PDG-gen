import java.util.*;

public class Main{
	
	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		
		// input
		final int NUM = scan.nextInt();
		int[] stick = new int[NUM];
		for(int i = 0; i < NUM; i++){
			stick[i] = scan.nextInt();
		}
		Arrays.sort(stick);
		
		// search
		int count = 0;
		for(int a = 0; a < NUM; a++){
			for(int b = 0; b < NUM; b++){
				if(a == b){
					continue;
				}
				int right = Arrays.binarySearch(stick, stick[a] + stick[b]);
				if(right < 0){
					right = right * -1 - 1;
				}
				int left = Arrays.binarySearch(stick, Math.max(stick[a] - stick[b], stick[b] - stick[a]));
				if(left < 0){
					left = left * -1 - 1;
				}
				for(int c = left; c < right; c++){
					if(a == c || b == c){
						continue;
					}
					if(stick[a] < stick[b] + stick[c] && stick[b] < stick[c] + stick[a]){
						count++;
					}
				}
			}
		}
		
		// output
		System.out.println(count / 6);
		
	}
}