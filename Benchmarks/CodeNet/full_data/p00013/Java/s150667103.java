import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> ans = new ArrayList<String>();
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			
			if (s.equals("0")) {
				ans.add(list.get(list.size() - 1));
				list.remove(list.size() - 1);
				continue;
			} else {
				list.add(s);
			}
			
		}
		
		for (String a : ans)
			System.out.println(a);
		
	}
	
}