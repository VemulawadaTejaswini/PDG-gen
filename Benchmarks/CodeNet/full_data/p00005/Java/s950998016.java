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
			
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			
			System.out.print(gcd(a, b) + " ");
			System.out.println(a * b / gcd(a,b));
		}
	}
	
	static int gcd(int K, int M){
		int k = K;
		int m = M;
		
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