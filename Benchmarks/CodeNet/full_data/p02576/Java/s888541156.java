package waterMelon;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int x=sc.nextInt();
			int t=sc.nextInt();
			
			if(x==1) System.out.println(n*t);
			//20 10 5
			int remaining=n-x;//
			while(remaining>0) {
				remaining -=x;
				t+=t;
			}
		
			System.out.println(t);
		
	    } 
		
}
