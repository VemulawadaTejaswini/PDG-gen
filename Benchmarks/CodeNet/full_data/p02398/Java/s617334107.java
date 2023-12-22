import java.util.*;

class Main{
	static int a;
	static int b;
	static int c;
	static int x;
	private static Scanner sc;
	public static void main(String[]agrs){
		sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		for(;a<=b;a++){
			if(c%a==0){
				x=x+1;
			}
			
		}
		System.out.println(x);

		
		
	}
}