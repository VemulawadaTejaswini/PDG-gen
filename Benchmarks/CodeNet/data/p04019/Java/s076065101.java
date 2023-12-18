import java.util.HashSet;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			char[] s = sc.next().toCharArray();
			HashSet<Character> m = new HashSet<Character>();
			
			for(int i=0;i<s.length;i++) {
				m.add(s[i]);
			}
			
			if(m.size()==4) {
				System.out.println("Yes");
				
			}else if(m.size()==2) {
				if((m.contains('N')&&m.contains('S'))||(m.contains('E')&&m.contains('W'))){
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}else {
				System.out.println("No");
			}	
						
	    }
				
	}
	
