import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			ArrayList<String>AL=new ArrayList<String>();
			int ans=0;
			for(;;)
			{
				String st=in.next();
				if(st.equals("="))
					break;
				AL.add(st);
			}
			ans=Integer.valueOf(AL.get(0));
			for(int i=1;i<AL.size()-1;i+=2)
			{
				if(AL.get(i).equals("+"))
					ans+=Integer.valueOf(AL.get(i+1));
				else if(AL.get(i).equals("-"))
					ans-=Integer.valueOf(AL.get(i+1));
				else if(AL.get(i).equals("*"))
					ans*=Integer.valueOf(AL.get(i+1));
				else if(AL.get(i).equals("/"))
					ans/=Integer.valueOf(AL.get(i+1));
			}
			System.out.println(ans);	
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}