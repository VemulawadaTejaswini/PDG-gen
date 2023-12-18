import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		br.readLine();
		String s = br.readLine();
		StringBuffer sb = new StringBuffer(s);
		int cnt = 0;
		while(true){
			String c = s;
			s = s.replaceFirst("101", "10");
			if(c.equals(s)){
				break;
			}
			cnt++;
		}
//		int cnt2 = cnt;
//		s = sb.reverse().toString();
//		for(int j = 0 ; j < cnt ; j++){
//			s = s.replaceFirst("101", "10");
//		}
//		while(true){
//			String c = s;
//			s = s.replaceFirst("101", "10");
//			if(c.equals(s)){
//				break;
//			}
//			cnt2++;
//		}
//		cnt = cnt>cnt2 ? cnt : cnt2;
		System.out.println(cnt);
	}
}
