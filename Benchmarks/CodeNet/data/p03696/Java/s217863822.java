import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

public class Main
{
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int i,l , r ;
		addFb(s);
		/*l =  searchLeft(s);
		r = n - l ;
		if(r != l){
			if(l > r)
			{
				sb.append(s);
				for(i = 0 ; i < l - r ; i++)
				{
					sb.append(')');
				}
			}
			else
			{
				for(i = 0 ; i < r - l ; i++)
				{
					sb.append('(');
				}
				sb.append(s);
			}
		}else{
			sb.append(s);
		}
		
		System.out.println(sb);*/
		
	}
	/*public static int searchLeft(String s)
	{
		int ans = 0;
		for(int i = 0 ; i < s.length() ; i++ ) 
		{
			if(s.charAt(i) == '('){
				ans ++;
			}
		
			
		}
		return ans;
	}
	*/
	public static void addFb(String s)
	{
		int lHp = 0 , rHp = 0 ;
		for(int i = 0 ; i < s.length() ; i++ ) 
		{
			if(s.charAt(i) == '('){
				lHp++ ;
			} 
			else
			{
				if(lHp > 0) lHp--;
				else rHp++;
			}	
		}
		for(int i = 0 ; i < rHp ; i++ ) 
		{
			sb.append('(');
		}
		sb.append(s);
		for(int i = 0 ; i < lHp ; i++ ) 
		{
			sb.append(')');
		}
		System.out.println(sb);	
	}
	
}