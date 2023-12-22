import java.io.*;

public class Main {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s;
			int sum = 0;
			while((s = reader.readLine()) != null) {
				int x = Integer.parseInt(s);
				for(int i = 1;i*x < 600;i++) {
					sum += f(i*x)*x;
				}
				System.out.println(sum);
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	public static int f(int x) {
		return x*x;
	}
}