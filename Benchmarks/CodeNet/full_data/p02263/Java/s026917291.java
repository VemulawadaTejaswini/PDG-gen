import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> stack = new ArrayDeque<>();
		String[] str = br.readLine().split(" ");
		int a,b;
		/*for(int i = 0; i < str.length ; i++){
			System.out.println(str[i]);
		}*/
		for(int i = 0; i < str.length ; i++)
		{
			switch(str[i])
			{
			case "+":
				a = stack.pollLast();
				b = stack.pollLast();
				stack.offer(b+a);
				//System.out.println("a+b"+a+" "+b+""+(a+b));
				
				break;
			case "-":
				a = stack.pollLast();
				b = stack.pollLast();
				stack.offer(b-a);
				//System.out.println("b-a"+b+" "+a+" "+(b-a));
				
				break;
			case "*":
				a = stack.pollLast();
				b = stack.pollLast();
				stack.offer(a*b);
				//System.out.println("a*b"+a+" "+b+""+(a*b));
				
				break;
					
			default :
				stack.offer(Integer.parseInt(str[i]));
				break;
			}
		}
		
		System.out.println(stack.poll());
		
	}
}