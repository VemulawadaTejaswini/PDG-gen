

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			String s = scan.nextLine();
			
			if(s.equals(".")) {break;}
			
			int par = 0;
			int brac = 0;
			Stack<Integer> pars = new Stack<Integer>();
			Stack<Integer> bracs = new Stack<Integer>();
			boolean done = false;
			
			for(int i = 0; i < s.length(); i++)
			{
				if(s.substring(i, i+1).equals("("))
				{
					//start
					pars.push(par);
					bracs.push(brac);
					
					par += 1;
				}
				if(s.substring(i, i+1).equals("["))
				{
					//start
					pars.push(par);
					bracs.push(brac);
					
					brac += 1;
				}
				if(s.substring(i, i+1).equals(")"))
				{
					par -= 1;
					
					if(par < 0) 
					{
						System.out.println("no");
						done = true;
						break;
					}
					
					//end
					int shouldbepar = pars.pop();
					int shouldbebrac = bracs.pop();
					if(par != shouldbepar || brac != shouldbebrac)
					{
						System.out.println("no");
						done = true;
						break;
					}
				}
				if(s.substring(i, i+1).equals("]"))
				{
					brac -= 1;
					
					if(brac < 0) 
					{
						System.out.println("no");
						done = true;
						break;
					}
					
					//end
					int shouldbepar = pars.pop();
					int shouldbebrac = bracs.pop();
					if(par != shouldbepar || brac != shouldbebrac)
					{
						System.out.println("no");
						done = true;
						break;
					}
				}
				
			}// ( [  ) ]
			// [ ( ] )
			if(!done)
			{
				if(par == 0 && brac == 0)
				{
					System.out.println("yes");
				}
				else
				{
					System.out.println("no");
				}
			}
			
		}
		
	}

}

