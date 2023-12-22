

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double x = 0.0;
		double y = 0.0;
		int theta = 90;
		
		String line;
		while ((line = br.readLine()) != null) {
			if (line.equals("0,0")) break;
			
			String[] arr = line.split(",");
			int hosu = Integer.parseInt(arr[0]);
			int kakudo = Integer.parseInt(arr[1]);
			
			x += hosu * Math.cos(Math.toRadians(theta));
			y += hosu * Math.sin(Math.toRadians(theta));
			
			theta -= kakudo;
		}
		
		System.out.println((int)x);
		System.out.println((int)y);
	}

}