import java.util.*;
class P
{
	int first;
	int second;
	P(int first, int second)
	{
		this.first = first;
		this.second = second;
	}
}
public class Main 
{
	static int strToInt(String str)
	{
		int num = 0;
		int multiple = 1;
		for(int i = str.length() - 1; i >= 0; --i)
		{
			num += (str.charAt(i) - '0') * multiple;
			multiple *= 10;
		}
		return(num);
	}
	
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			String tmpStr = stdIn.next();
			int L = stdIn.nextInt();
			if(tmpStr.equals("0") && L == 0)
			{
				break;
			}
			int n = tmpStr.length();
			String str = "";
			for(int i = 0; i < L - n; ++i)
			{
				str += "0";
			}
			for(int i = 0; i < n; ++i)
			{
				str += tmpStr.charAt(i);
			}
			List<P> pairs = new ArrayList<P>();
			pairs.add(new P(strToInt(str), 0));
			int count = 0;
			boolean flag = false;
			while(!flag)
			{
				++count;
				List<Character> c = new ArrayList<Character>();
				for(int i = 0; i < L; ++i)
				{
					c.add(str.charAt(i));
				}
				Collections.sort(c);
				String sMin = "";
				for(int i = 0; i < L; ++i)
				{
					sMin += c.get(i);
				}
				String sMax = "";
				for(int i = sMin.length() - 1; i >= 0; --i)
				{
					sMax += sMin.charAt(i);
				}
				int a = strToInt(sMax) - strToInt(sMin);
				for(int i = 0; i < pairs.size(); ++i)
				{
					if(pairs.get(i).first == a)
					{
						System.out.println(i + " " + a + " " + (count - i));
						flag = true;
						break;
					}
				}
				pairs.add(new P(a, count));
				String temp = "";
				for(int i = 0; i < L; ++i)
				{
					temp += a % 10;
					a /= 10;
				}
				str = temp;
			}
		}
	}
}