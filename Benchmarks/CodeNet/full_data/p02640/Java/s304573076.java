//package ABC170;

import java.util.*;
import java.io.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int l=sc.nextInt();
		
		int x=(4*a-l)/2;
		int y=(l-2*a)/2;
		
		if(x>=0 && y>=0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
			
		

	}

}
