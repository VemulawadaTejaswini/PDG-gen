import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringBuffer sb = new StringBuffer(s);
		int len = s.length();
		int f = 0;
		int cnt = 0;
		while((f = s.indexOf("101")) != -1){
			s = s.replaceFirst("101", "010");
			cnt++;
		}
		int cnt2 = 0;
		s = sb.reverse().toString();
		while((f = s.indexOf("101")) != -1){
			s = s.replaceFirst("101", "010");
			cnt2++;
		}
		cnt = cnt>cnt2 ? cnt : cnt2;
		System.out.println(cnt);
	}
}