import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main101a {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new
		 InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] st = str.split(" ");
		int[] in = new int[st.length];
		for (int i = 0; i < st.length; i++)
			in[i] = Integer.parseInt(st[i]);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (in[i] < in[j]) {
					int tmp = in[i];
					for (int l=i; l > j; l--)
						in[l] = in[l - 1];
					in[j] = tmp;break;
					}

			}System.out.print(in[0]);
					for (int l = 1; l < n; l++)
						System.out.print(" " + in[l]);
					System.out.println();
		}

	}

}