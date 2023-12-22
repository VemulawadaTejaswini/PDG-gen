package Main;

import java.util.*;
class Main{
	private static Scanner sc;
    static int x;
    static int y;

	public static void main(String[]agrs){
		sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println();
		while(x!=-0&&y!=0){
			if(x>y){
				System.out.println(y+" "+x);
			}else if(y>x){
				System.out.println(x+" "+y);
			}else{
				System.out.println(x+" "+y);
			}
			 x=sc.nextInt();
			 y=sc.nextInt();
			
		}
		
		
		
	}
}