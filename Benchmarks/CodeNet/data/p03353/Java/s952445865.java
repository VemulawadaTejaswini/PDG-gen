import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String s = scan.next();
			int K = scan.nextInt();
			
			Map<String,Integer>map = new TreeMap<String,Integer>();
			
			
			
			for(int i = 0;i<s.length();i++) {
				for(int j = i+1;j<=s.length();j++) {
					map.put(s.substring(i,j), 1);
				}
			}
			
			
			
			int count = 0;
			for(String l:map.keySet()) {
				count++;
				if(count==K)
					System.out.println(l);
			}
			
			
			
		}
		
		
	}
		

}
