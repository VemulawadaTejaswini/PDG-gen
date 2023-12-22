import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		int cnt = 0;
		StringTokenizer st;
		
		String target = br.readLine();
		
		while(true) {
			String s = br.readLine();
			if(s.equals("END_OF_TEXT"))
				break;
			s += " ";
			str += s;
		}
		System.out.println(str);
		st = new StringTokenizer(str.toLowerCase()," ");
		while(st.hasMoreTokens()) {
			if(target.equals(st.nextToken()))
				cnt++;
		}
		System.out.println(cnt);
	}
	
}