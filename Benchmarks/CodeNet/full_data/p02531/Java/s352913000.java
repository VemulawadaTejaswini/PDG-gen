import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] block = new char[1000];
		int i = 0;
		
		for(;;)
		{
			String cmd = sc.next();
			
				if(cmd.equals("push"))
				{
					block[i] = sc.next().charAt(0);
					i++;
				}
				if(cmd.equals("pop"))
				{
					i--;
					System.out.println(block[i]);
				}
				if(cmd.equals("quit"))
				{
					break;
				}
		}
	}
}