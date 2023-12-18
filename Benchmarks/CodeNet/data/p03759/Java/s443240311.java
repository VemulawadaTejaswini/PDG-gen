import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] s = str.split(" ",0);
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			if((a+c)/2 == b) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}
}
