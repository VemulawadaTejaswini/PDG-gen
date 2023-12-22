import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cases = new int[1024];
		int count = 0;
		String line;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			while (true) {
				line = buf.readLine();
				cases[count] = Integer.parseInt(line);
				if (cases[count] == 0)
					break;
				count++;
			}
			for (int i = 0; i < cases.length; i++) {
				if (cases[i] == 0)
					break;
				System.out.println("Case " + (i + 1) + ": " + cases[i]);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}