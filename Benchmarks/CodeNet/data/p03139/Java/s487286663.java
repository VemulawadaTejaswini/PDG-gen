import java.io.*;
public class Main {
	public static void main(String[] args) {
		try {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        String param = new String(in.readLine());
	        String[] params = param.split(" ");
	        int n = Integer.parseInt(params[0]);
	        int a = Integer.parseInt(params[1]);
	        int b = Integer.parseInt(params[2]);
		
			int max = a < b ? a : b;
			int min;
			if ((a + b) < n) {
				min = 0;
			} else {
				min = (a + b) - n;
			}
			System.out.println(String.valueOf(max) + " " + String.valueOf(min));
		} catch (Exception ex) {}
	}
}