import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> in  = new Stack<Integer>();
		int count=0;
		String s;
		while(true){
			s=br.readLine();
			int num = Integer.parseInt(s);
			
			if(num==0)
				System.out.println(in.pop());
			else 	{
				in.push(num);
				count++;
			}
			if(count==10){
				break;
		    }
		}
	}
}