import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main 
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> in  = new Stack<Integer>();
		Queue<Integer> out = new LinkedList<Integer>();
		String s;
		while((s=br.readLine())!=null){
			int num = Integer.parseInt(s);
			
			if(num==0)
				out.offer(in.pop());
			else 	
				in.push(num);
			
			if(in.isEmpty())
				for(int i : out)
					System.out.println(i);
		}
	}
}