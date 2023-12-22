	import java.util.*;
	
	public class mon1{
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			int a = 0;
			int b = 0;
			int c = 0;
			for(int i=1;i<=7;i++){
				a = scan.nextInt();
				b = scan.nextInt();
				if(a >= b){
					c = a - b;
				}
				System.out.println(c);
			}
		}
	}
	