
	


import java.util.*; 
	public class Main {
	public static void main( String[] args) {			
					
					Scanner in = new Scanner(System.in);
					String a = in.next();
					int l = a.length();
					int flag =0;
					for(int i = 0;i<l;i++) {
						if(a.charAt(i)=='7') {
							flag = 1;
							break;
						}
					}
					if(flag ==1)
					System.out.println("Yes");
					
					else {
						System.out.println("No");
					}
					
			}}