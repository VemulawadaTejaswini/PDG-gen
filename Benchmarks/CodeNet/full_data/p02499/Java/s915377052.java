import java.io.*;
public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int[] num = new int[26];
			String line = reader.readLine();
			line = line.toLowerCase();

			for(int i = 0; i < num.length; i++)
				num[i] = 0;

			for(char ch = 'a'; ch <= 'z'; ch++)
				for(int i = 0; i < line.length(); i++)
					if(line.charAt(i) == ch)
						num[ch - 97]++;

			for(char ch = 'a'; ch <= 'z'; ch++)
				System.out.println(ch + " : " + num[ch - 97]);
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}