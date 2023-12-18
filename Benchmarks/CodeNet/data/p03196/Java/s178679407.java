

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		long N = keyboard.nextLong();
		long P = keyboard.nextLong();
		
		HashMap<Long, Integer> prime = new HashMap<Long, Integer>();
		for (int i=2;i*i<=P;i++) {
			while (P % i == 0) {
				int count = prime.containsKey((long)i) ? prime.get((long)i) : 0;
				prime.put((long)i, count + 1);
				P /= i;
			}
		}
		if (P != 1) prime.put(P, 1);
		
		long ans = 1;
        for (Map.Entry<Long, Integer> entry : prime.entrySet()) {
            for (int i=0; i < entry.getValue() / N; i++) {
        		ans *= entry.getKey();
        	} 
        }
		
		System.out.println(ans);
		keyboard.close();
	}
	
}