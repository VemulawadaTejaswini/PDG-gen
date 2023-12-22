import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb =new StringBuffer(br.readLine());
		int start = 0;
		int end = sb.length() - 1;
		int count = 0;
		
		while(end > start)
		{
			if(sb.charAt(start) == 'W')
			{
				if(sb.charAt(end) == 'R')
				{
				//	sb.replace(start, end, sb.toString());
					count++;
					start++;
					end--;
					
				}
				else
				{
					end--;
				}
			}
			else
			{
				start++;
				
			}
			//System.out.println(count);
		}
		System.out.println(count);
		
	}

}
