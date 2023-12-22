import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String x = "";
		try {
			x = in.readLine();
			char[] word = x.toCharArray();
			
			String str;
			while ((x = in.readLine()) != null) {
				String[] ins = x.split(" ");
				int a = Integer.parseInt(ins[1]);
				int b = Integer.parseInt(ins[2]);
				
				if (ins.equals("print")) {
					for (int i = a; i < (b - a + 1); i++) {
						System.out.print(word[i]);
					}
					System.out.println();
				} else if (ins.equals("reverse")) {
					str = String.valueOf(word).substring(a, (b + 1));
					for (int i = 0; i < str.length(); i++) {
						word[b - i] = str.charAt(i);
					}
				} else {
					str = ins[3];
					for (int i = 0; i < str.length(); i++) {
						word[a + i] = str.charAt(i);
					}
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}