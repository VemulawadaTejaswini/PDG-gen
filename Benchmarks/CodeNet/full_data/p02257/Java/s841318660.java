import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++){
			numbers.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(numbers);
		int maxInNumbers = numbers.get(numbers.size()-1);
		
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		
		for (int i = 2; i < maxInNumbers; i++) {
			boolean flag = true;
			
			for(int j = 2; j < i; j++){
				if (i % j == 0){
					flag = false;
					break;
				}
			}
			
			if (flag){
				primeNumbers.add(i);
			}
			
		}
		
		
		int ans = 0;
		
		for (int i = 0; i < numbers.size(); i++) {
			boolean flag = true; 
			
			for(int j = 0; j < primeNumbers.size()-1 && primeNumbers.get(j) < numbers.get(i); j++){
				if (numbers.get(i) % primeNumbers.get(j) == 0){
					flag = false;
					break;
				}
			}
			
			if (flag){
				ans++;
			}
			
		}
		
		System.out.println(ans);
		
	}
	
}