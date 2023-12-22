import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if(n == 0 && m == 0)
			{
				break;
			}
			List<Integer> taro = new ArrayList<Integer>();
			List<Integer> hanako = new ArrayList<Integer>();
			int sumTaro = 0;
			int sumHanako = 0;
			for(int i = 0; i < n; ++i)
			{
				int a = stdIn.nextInt();
				taro.add(a);
				sumTaro += a;
			}
			for(int i = 0; i < m; ++i)
			{
				int a = stdIn.nextInt();
				hanako.add(a);
				sumHanako += a;
			}
			int diff = sumTaro - sumHanako;
			int min = 999999999;
			int[] ans = new int[2];
			boolean okFlag = false;
			for(int i = 0; i < n; ++i)
			{
				for(int j = 0; j < m; ++j)
				{
					if((taro.get(i) - hanako.get(j) == diff / 2.0) && (taro.get(i) + hanako.get(j) < min))
					{
						okFlag = true;
						min = taro.get(i) + hanako.get(j);
						ans[0] = taro.get(i);
						ans[1] = hanako.get(j);
					}
				}
			}
			if(okFlag)
			{
				System.out.println(ans[0] + " " + ans[1]);
			}
			else
			{
				System.out.println(-1);
			}
		}
	}
}