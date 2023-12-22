package Main;

import java.util.*;
class Main{
	private static Scanner sc;
    static int x;
    static int y;

	public static void main(String[]agrs){
		sc = new Scanner(System.in);
    	x=sc.nextInt();
	    y=sc.nextInt();
		   System.out.println();
		while(true){
		    if(0==x&&0==y)break;
		    System.out.println(Math.min(x,y)+" "+Math.max(x,y));
		    
		}
		
	}
}