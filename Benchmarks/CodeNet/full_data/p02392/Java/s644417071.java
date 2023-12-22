import java.util.*;

class Main {
	static Scanner sc =new Scanner(System.in);
	static int a;
	static int b;
	static int c;
		public static void main (String[]agrs){
			a =sc.nextInt();
			b =sc.nextInt();
			c =sc.nextInt();
			if(a<b){
				if(b<c){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
				
			}else{System.out.println("No");
			}
	}

}