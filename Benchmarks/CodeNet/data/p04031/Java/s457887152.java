import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		int N = sc.nextInt();
		
		int[] numbers = new int[N];
		
		numbers[0] = sc.nextInt();
		
		int candidate = numbers[0];
		
		List<Integer> candidates = new ArrayList<Integer>();
		
		for (int i = 1; i < N; i++) {			
			numbers[i] = sc.nextInt();
			
			if(numbers[i] != candidate) {
				if(Math.abs(numbers[i] - candidate) > 1) {
					candidate = ((numbers[i] + candidate)%2 == 0)?(numbers[i] + candidate)/2 : (numbers[i] + candidate + 1)/2;
					if(!candidates.contains(candidate)) {
						candidates.add(candidate);
					}
				}
			}			
		}	
		
		if(!candidates.contains(candidate)) {
			candidates.add(candidate);
		}
		
		int total = -1;
		
		for (Integer cand : candidates) {
			int total_aux = 0;
			for (int i = 0; i < numbers.length; i++) {
				total_aux += ((candidate - numbers[i]) * (candidate - numbers[i])); 
			}			
			
			if(total < 0) {
				total = total_aux;
			}
			
			if(total < total_aux) {
				total = total_aux;
			}			
		}
		
		System.out.println(total);
	}
}