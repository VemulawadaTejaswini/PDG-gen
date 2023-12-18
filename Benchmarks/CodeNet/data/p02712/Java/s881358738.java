
	


import java.util.*; 
	public class Main {
	public static void main( String[] args) {			
					
					Scanner in = new Scanner(System.in);
					int a = in.nextInt();
					int s = 0;
					
					for(int i = 1;i<=a;i++) {
						if(i%3 != 0 && i%5 != 0) {
							s += i;
						}
					}
					System.out.println(s);
					
			}}