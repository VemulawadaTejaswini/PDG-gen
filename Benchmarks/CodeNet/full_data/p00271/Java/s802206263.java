	import java.util.*;
	
	public class Main{
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			for(int i = 1;i<=7;i++){
				int a = scan.nextInt();
				int b = scan.nextInt();
				a = a - b;
				System.out.println(a);
			}
		}
	}
	