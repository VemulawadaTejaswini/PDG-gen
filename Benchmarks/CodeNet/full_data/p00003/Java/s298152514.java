
import java.io.*;

public class Main {

	//ツ　0003
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());
		
		for(int i = 0; i < n; i++) {
			
			String s = reader.readLine();
//			if (s == null)
//				break;
			
			String[] sp = s.split(" ");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			int c = Integer.parseInt(sp[2]);
			if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a) {
				System.out.printf("YES\n");
			}
			else {
				System.out.printf("NO\n");
			}
		}
		reader.close();
	}
}