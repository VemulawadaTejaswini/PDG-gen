import java.util.*;

class Main
{

    //------------stack-------------
    static class Stack
    {
	int[] stack = new int[100];
	int head=0;
	
	void push(int n)
	{
	    stack[head]=n;
	    head++;
	}
	
	int pop()
	{
	    head--;
	    int i=stack[head];
	    return i;
	}
    }
    
    //-----------Main---------------
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	Main.Stack stack = new Main.Stack();
	String s;
	int x, y;
	int i, j, k;

	i=0;
	while(sc.hasNext())
	    {
		//Read number
		if(sc.hasNextInt()==true)
		    {
			stack.push(sc.nextInt());
		    }
		//Read operand
		else
		    {
			s=sc.next();
			//+
			if(s.equals("+")==true)
			    {
				x=stack.pop();
				y=stack.pop();
				stack.push(y+x);
			    }
		
			//-
			else if(s.equals("-")==true)
			    {
				x=stack.pop();
				y=stack.pop();
				stack.push(y-x);
			    }
			//*
			else if(s.equals("*")==true)
			    {				
				x=stack.pop();
				y=stack.pop();
				stack.push(y*x);
			    }
			//else if(s.equals(null)==true)break;
		    }
	    }
    
    
	//print
	System.out.println(stack.stack[0]);
	sc.close();
    
    }

}