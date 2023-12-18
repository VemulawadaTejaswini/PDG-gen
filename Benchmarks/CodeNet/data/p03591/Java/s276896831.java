import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			//int N = Integer.parseInt(str);
			//StringBuilder sb = new StringBuilder();
			//String[] s = str.split(" ",0);

			if(str.substring(0, 4).equals("YAKI")) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
//			System.out.println(sb);
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}

}
