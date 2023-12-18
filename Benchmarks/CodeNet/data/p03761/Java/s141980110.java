import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int n = scan.nextInt();
			String[]S = new String[n];
			ArrayList<Map<Character,Integer>>aray = new ArrayList<Map<Character,Integer>>();
			
			for(int i = 0;i<n;i++) {
				Map<Character,Integer> map = new TreeMap<Character,Integer>();
				for(int j = 0;j<26;j++){
					char x =(char)('a'+j);
					map.put(x, 0);
				}
				aray.add(map);
			}
			
			
			for(int i = 0;i<n;i++) {
				S[i] = scan.next();
				char[]s = new char[S[i].length()];
				s = S[i].toCharArray();
				for(int j = 0;j<s.length;j++) {
					aray.get(i).put(s[j], aray.get(i).get(s[j])+1);
				}
			}
			
			StringBuffer sb = new StringBuffer();
			
			
			for(int i = 0;i<25;i++) {
				char y = (char)('a'+i);
				int min = Integer.MAX_VALUE;
				for(int j = 0;j<n;j++) {
					int k = aray.get(j).get(y);
					if(min>k)min =k;
				}
				if(min!=0) {
					for(int j = 0;j<min;j++) {
						sb.append(y);
					}

				}
				
			}
			
			System.out.println(sb.toString());
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
		

}
