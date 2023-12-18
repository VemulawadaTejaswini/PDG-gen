import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}
	
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		int N = file.nextInt();
		int K = file.nextInt();
		ArrayList<Integer> start = new ArrayList<Integer>();
		ArrayList<Integer> end = new ArrayList<Integer>();
		char[] chars = file.next().toCharArray();
		if(chars[0] == '1')
			end.add(0);
		boolean active = false;
		for(int i = 1;i<chars.length;i++)
		{

			if(chars[i] == '0' && chars[i-1] == '1')
			{
				start.add(i);
			}
			if(chars[i] == '1' && chars[i-1] == '0')
			{
				end.add(i);
			}
		}
		if(chars[chars.length - 1] == '1')
			start.add(chars.length);
		if(start.size() <= K)
		{
			System.out.println(N);
			return;
		}
		int max = 0;
		for(int i = K;i<start.size();i++)
		{
			max = Math.max(max, start.get(i) - end.get(i-K));
		}
		System.out.println(max);
	}
}
