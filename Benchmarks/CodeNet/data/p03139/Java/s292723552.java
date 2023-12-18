import java.io.*;
public class Main {
	public static void main(String[] args) {
		try {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(in.readLine());
	        int a = Integer.parseInt(in.readLine());
	        int b = Integer.parseInt(in.readLine());
		
			int max = a < b ? b : a;
			int min;
			if ((a + b) < n) {
				min = 0;
			} else {
				min = (a + b) - n;
			}
			System.out.println(String.valueOf(min));
			System.out.println(String.valueOf(max));
		} catch (Exception ex) {}
	}
}
