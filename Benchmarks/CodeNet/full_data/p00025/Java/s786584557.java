import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> ans = new ArrayList<String>();
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			
			StringTokenizer st1 = new StringTokenizer(s," ");
			StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
			
			ArrayList<String> str1 = new ArrayList<String>();
			ArrayList<String> str2 = new ArrayList<String>();
			
			while (st1.hasMoreTokens()) {
				str1.add(st1.nextToken());
				str2.add(st2.nextToken());
			}
			
			int cntHit = 0;
			int cntBlow = 0;
			
			for (int i = 0; i < str1.size(); i++) {
				if (str1.get(i).equals(str2.get(i))) cntHit++;
			}
			
			for (int i = 0; i < str2.size(); i++) {
				if (str1.contains(str2.get(i)) && (str1.indexOf(str2.get(i)) != i)) {
					cntBlow++;
				}
			}
			ans.add(String.valueOf(cntHit) + " " + String.valueOf(cntBlow));
		}
		
		for (String a : ans)
			System.out.println(a);
	}
	
}