import java.util.ArrayList;
import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] b = new int[n+1];
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			
			for(int i=1;i<=n;i++) {
				b[i] = sc.nextInt();
			}
			
			while(true) {
				boolean endflg = true;
				for(int i=n;i>=1;i--) {
					
					int count = 0;
					if(b[i]==i&&b[i]!=0) {
						list.add(i);
						count++;
						endflg = false;
						
						
						for(int j=i;j<n;j++) {
							b[j]=b[j+1];
						}
						b[n+1-count]=0;
						
						
						break;
					}
					
					
				}
				
				if(list.size()==n) {
					break;
				}
				
				if(endflg) {
					System.out.println(-1);
					return;
				}
			}
			
			
			for(int i=list.size()-1;i>=0;i--) {
				System.out.println(list.get(i));
			}
			
	    }
		
	}
	
