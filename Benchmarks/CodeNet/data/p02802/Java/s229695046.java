import java.math.*;
import java.util.*;
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] p = new int[m];
			String[] s = new String[m];
			int[] result = new int[m];
			Set<Integer> ac = new HashSet<>();
			int sumWA =0;
			
			for(int i=0;i<m;i++) {
				p[i]=sc.nextInt();
				s[i]=sc.next();
			}
			
			for(int i=0;i<m;i++) {
				if(s[i].equals("AC")) {
					result[i]=1;
				}else {
					result[i]=0;
				}
			}
			
			for(int i=0;i<m;i++) {
				if(result[i]==1) {
					ac.add(p[i]);
					
					for(int j=0;j<i;j++) {
						if(p[i]==p[j]&&s[j].equals("WA")) {
							sumWA++;
						}
					}
					
				}
			}
			
			System.out.println(ac.size()+" "+sumWA);
			
			
			
		}
				
	}
	
	