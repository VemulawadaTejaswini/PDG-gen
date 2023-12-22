import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			String[] str = new String[n];
			String ans;

			for(int i = 0; i < n; i++)
				str[i] = reader.readLine();

			ans = str[0];
			for(int i = 1; i < n; i++)
				if(ans.compareTo(str[i]) > 0)
					ans = str[i];

			System.out.println(ans);
		} catch(IOException e) {
			System.out.println(e);
		}

	}
}