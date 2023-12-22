import java.util.*;
public class Main
{	
	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<String>();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> operators = new ArrayList<String>();
		operators.add("*"); 
		operators.add("/"); 
		operators.add("-"); 
		operators.add("+");
		//////////////////////////////////////// apparently there's a Scanner bug and having 2 scanners fixes it
		Scanner in = new Scanner(System.in);
		String bug = in.nextLine();
		Scanner real = new Scanner(bug);
		////////////////////////////////////////
		while(real.hasNext())
		{
			list.add(real.next());
		}
		in.close();
		real.close();
		////////////////////////////////////////
		for(int i =0;i<list.size();i++)
		{
			if(!operators.contains(list.get(i)))
			{
				stack.push(list.get(i));
			}
			else
			{
				//sets the values for the numbers that are to be computed
				int n2 = Integer.valueOf(stack.pop());
				int n1 = Integer.valueOf(stack.pop());
				//checks what the next operator is
				if(list.get(i).equals(operators.get(0)))
				{
					stack.push(String.valueOf(n1*n2));
				}
				else if(list.get(i).equals(operators.get(1)))
				{
					stack.push(String.valueOf(n1/n2));
				}
				else if(list.get(i).equals(operators.get(2)))
				{
					stack.push(String.valueOf(n1-n2));
				}
				else
				{
					stack.push(String.valueOf(n1+n2));
				}
			}
		}
		System.out.println(stack.pop());
	}
}
