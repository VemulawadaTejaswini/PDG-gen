//package CodeForces;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String t=s.next();
		if(t.length()==str.length()+1&&str.equals(t.substring(0,t.length()-1)))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}


	}

}
