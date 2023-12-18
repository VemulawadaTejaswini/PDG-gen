
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] banned = new int[K];
		int[] allowed = new int[10-K];
		
		
		for (int i = 0; i < K; i++) {
			//get strings
			banned[i] = sc.nextInt();
		}
		
		java.util.Arrays.sort(banned);
		
		int j = 0;
		int index = 0;
		
		for(int i = 0; i < 10; i++) {
			if(j == K) {
				allowed[index] = i;
				index++;
				continue;
			}
			if(i != banned[j]) {
				allowed[index] = i;
				index++;
			} else {
				j++;
			}			
		}
				
		String N_str = Integer.toString(N);
		int output = 0;
		
		for (int i = 0; i < N_str.length(); i++) {
			if(N_str.substring(i, i+1) == "") {
				continue;
			}
			int digit =  N%10;
            N = N/10;						
			output = getAllowed(digit, allowed, output, i);
			
		}
			
		
		
		// output
		System.out.println(output);
	}	
	
	public static int getAllowed(int i, int[] allowed, int output, int carry) {
		boolean in_array = false;
		int j = 0;
		int min_dig = 10;
		for (j = 0; j < allowed.length; j++) {
			if (i == allowed[j]) {
				in_array = true;				
			}
						
			if(i < allowed[j] && allowed[j] < min_dig) {				
				min_dig = allowed[j];				
			}
		}
				
		if(in_array) {
			if(output == 0 && carry > 0) {
				output = i * (int) Math.pow(10, carry);
			} else {
				output = (output * 10) + i;	
			}
			
		} else {
			if(min_dig < 10) {
				if(output == 0 && carry > 0) {
					output = min_dig * (int) Math.pow(10, carry);
				} else {
					output = (output * 10) + min_dig;	
				}	
			} else {
				if(output == 0 && carry > 0) {
					output = allowed[0] * (int) Math.pow(10, carry);
				} else {
					output = (allowed[0] * 10 + output);	
				}
			}			
		}		
		
		return output;
	}
	
}