import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = "";
		
		while((input = br.readLine()) != null){
			String[] arr = input.split(" ");
			
			long a = Integer.parseInt(arr[0]);
			long b = Integer.parseInt(arr[1]);
			
			long x = gcd(a, b);
			
			System.out.print(x + " ");
			System.out.println((a * b) / x);
		}
	}
	
	static long gcd(long a, long b){
		long k = a;
		long m = b;
		
		while(k != m){
			if(k > m){
				k = k - m;
			}
			else{
				m = m - k;
			}
		}
		return k;
	}

}