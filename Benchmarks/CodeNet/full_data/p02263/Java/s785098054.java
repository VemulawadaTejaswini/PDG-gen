import java.util.*;

class Main
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	int[] stack1 = new int[100];
	int[] stack2 = new int[100];
	String s;
	int i, j, k;

	i=0;
	k=0;
	while(sc.hasNext()!=false)
	    {
		if(sc.hasNextInt()==true)
		    {
			stack1[i]=sc.nextInt();
			i++;
		    }
		else
		    {
			s=sc.next();
			if(s.equals("+")==true)
			    {
				if(i!=0)
				    {
					for(j=1; j<i; j++)
					    {
						stack1[0]+=stack1[j];	
					    }
					i=0;
					stack2[k]=stack1[0];
					k++;
				    }
				else
				    {
					for(j=1; j<k; j++)
					    {
						stack2[0]+=stack2[j];
					    }
					k=0;
				    }
			    }
			else if(s.equals("-")==true)
			    {
				if(i!=0)
				    {
					for(j=1; j<i; j++)
					    {
						stack1[0]-=stack1[j];	
					    }
					i=0;
					stack2[k]=stack1[0];
					k++;
				    }
				else
				    {
					for(j=1; j<k; j++)
					    {
						stack2[0]-=stack2[j];
					    }
					k=0;
				    }
			    }
			else if(s.equals("*")==true)
			    {
				if(i!=0)
				    {
					for(j=1; j<i; j++)
					    {
						stack1[0]*=stack1[j];	
					    }
					i=0;
					stack2[k]=stack1[0];
					k++;
				    }
				else
				    {
					for(j=1; j<k; j++)
					    {
						stack2[0]*=stack2[j];
					    }
					k=0;
				    }
			    }
			else break;
		    }
	    }

	System.out.println(stack2[0]);
    }
}