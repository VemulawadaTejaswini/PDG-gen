import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
//			int N = Integer.parseInt(str);
//			str = br.readLine();
			String[] s = str.split(" ",0);
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			if((a+b)<10) {
				System.out.println(a+b);
			}else {
				System.out.println("error");
			}
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}
}
