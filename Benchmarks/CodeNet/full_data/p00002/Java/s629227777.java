

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		while ((line = br.readLine()) != null) {
			String[] arr = line.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			
			System.out.println(f(a + b));
		}
	}
	
	public static int f(int sum) {
		int i = 0;
		while (sum != 0) {
			sum /= 10;
			i++;
		}
		
		return i;
	}

}