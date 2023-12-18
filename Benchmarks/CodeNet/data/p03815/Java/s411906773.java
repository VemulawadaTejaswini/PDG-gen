	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	public class Main {
		public static void main(String[] args) {
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			String input = "2";
			try {
				input = br.readLine();
			} catch (IOException e) {
			}
	
			long K = Long.valueOf(input);
			long Km = K/11;
			long Kr = K%11;
			if(Kr <= 5)
				System.out.print(Km * 2 + 1);
			else
				System.out.print(Km * 2 + 2);
		}
	}
