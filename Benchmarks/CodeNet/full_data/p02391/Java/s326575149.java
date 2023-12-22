import java.util.*;

class Main {
	static Scanner sc =new Scanner(System.in);
	static int a;
	static int b;
		public static void main (String[]agrs){
			a =sc.nextInt();
			b =sc.nextInt();
			
			if (a>b){
				System.out.println("a > b");		
			}else if(a<b){
				System.out.println("a < b");
			}else if(a==b){
				System.out.println("a == b");
			}
	}

}