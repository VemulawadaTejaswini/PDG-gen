import java.io.*;
import java.util.*;

class Main {
	
	static String[] words = {"the","this","that"};
	
	static String alp = "abcdefghijklmnopqrstuvwxyz";
	
	
	public static String chiper (String code) {
		
		String decode = "";
		
		for (int shift = 1; shift <= 25; shift++) {
			
			for (int i = 0; i < code.length(); i++) {
				
				String s = String.valueOf(code.charAt(i));
				if (s.equals(".")) {
					decode += ".";
					continue;
				} else if (s.equals(" ")) {
					decode += " ";
					continue;
				}
				int index = (alp.indexOf(s) + shift) % 26;
				decode += alp.charAt(index);
				
			}
			
			StringTokenizer st = new StringTokenizer(decode," ");
			boolean flag = false;
			
			while (st.hasMoreTokens()) {
				
				String tmp2 = st.nextToken();
				String tmp = "";
				
				for (int j = 0; j < tmp2.length(); j++) {
					if (!String.valueOf(tmp2.charAt(j)).equals(".")) {
						tmp += String.valueOf(tmp2.charAt(j));
					}
				}
				
				for (int j = 0; j < words.length; j++) {
					if (words[j].equals(tmp)) {
						flag = true;
						break;
					}
				}
				
				if (flag) break;
				
			}
			
			if (flag) break;
			decode = "";
			
		}
		
		return decode;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> ans = new ArrayList<String>();
		
		while(true) {
			String code = br.readLine();
			if (code == null) break;
			ans.add(chiper(code));
		}
		for (String a : ans)
			System.out.println(a);
	}
	
}