import java.util.Scanner;
import java.util.Stack;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			Scanner pol = new Scanner(sc.nextLine());
			Stack<Double> stack = new Stack<Double>();
			while (pol.hasNext())
			{
				String str = pol.next();
				char a = str.charAt(0);
				try
				{
					stack.push((double) Integer.parseInt(str));
				}
				catch (NumberFormatException e)
				{
					double x = stack.pop();
					double y = stack.pop();
					switch (a)
					{
					case '+':
						stack.push(y + x);
						break;
					case '-':
						stack.push(y - x);
						break;
					case '*':
						stack.push(y * x);
						break;
					case '/':
						stack.push(y / x);
						break;
					}
				}
			}
			System.out.printf("%.6f\n", stack.pop());
		}
	}
}