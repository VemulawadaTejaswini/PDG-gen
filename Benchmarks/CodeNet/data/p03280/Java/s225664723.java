import java.io.*;

public class Main {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		
		try {
			String str = reader.readLine();
			String[] str_sp = str.split(" ");
			
			int A = Integer.parseInt(str_sp[0]);
			int B = Integer.parseInt(str_sp[1]);
			
			int S = A * B - A - B + 1;
			System.out.println(S);
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
