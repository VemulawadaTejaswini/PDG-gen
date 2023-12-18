import java.util.Scanner;
import java.util.Stack;

public class Pushpush {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		int[] num = new int[count];
		for(int i = 0; i < count; i++)
		{
			num[i] = input.nextInt();
		}
		Stack<Integer> stack = new Stack<Integer>();
		int[] res =  new int[count];
		
		res[0] = num[0];
		for(int i = 1; i < count; i++)
		{
			stack.clear();
			for(int j = 0; j < i; j++)
			{
				stack.push(res[j]);
			}	
			stack.push(num[i]);
			
			for(int k = 0; k <= i; k++)
			{
				res[k] = stack.pop();
			}			
		}
		
		for(int i = 0; i < count; i++)
		{
			System.out.print(res[i] + " ");
		}
		
		
	}
}