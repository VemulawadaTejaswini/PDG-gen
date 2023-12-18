//package abc136;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int k = Integer.parseInt(tmpArray[1]);
		
		int input[] = new int[n];
		
		tmpArray = br.readLine().split(" ");
		
		long sum = 0;
		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
			sum += input[i];
		}
		
		long divisor = 1;
		long result = 1;
		while(sum/divisor > 1){
			long tmpGCD = sum/divisor;
			
			long plus = 0;
			long minus = 0;
			for(int i = 0; i < n; i++){
				long tmpPlus = tmpGCD - (input[i]%tmpGCD);
				long tmpMinus = input[i]%tmpGCD;
				if(tmpPlus <= tmpMinus){
					plus += tmpPlus;
				}
				else {
					minus += tmpMinus;
				}
			}
			
//			System.out.println("plus "+plus+" minus "+ minus);
			if(minus <= k){
				result = tmpGCD;
				break;
			}
//			System.out.println((sum/divisor) + "is failed");
			
			for(long i = divisor + 1; i <= sum; i++){
				if(sum % i == 0){
					divisor = i;
					break;
				}
			}
			
			
		}
		
		System.out.println(result);
	}

}
