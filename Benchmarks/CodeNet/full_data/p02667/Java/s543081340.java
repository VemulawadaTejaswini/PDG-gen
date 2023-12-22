import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
	private static Map<String,Integer> intMap = new HashMap<>();
	private static Map<String,Integer> intMap2 = new HashMap<>();

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int ans = solve(str);
		System.out.println(ans);
	}

	public static int solve(String str)
	{
		if(intMap.containsKey(str)){
			return intMap.get(str);
		}
		if (str.length() == 0) {
			return 0;
		}
		int ans = count(str);
		int ans2 = 0;

		for (int i = 0; i < str.length(); i++)
		{
			String str2 = newStr2(str, i);
			ans2 = Math.max(ans2, solve(str2));
		}
		intMap.put(str, ans+ans2);
		return ans+ans2;
	}

	private static String newStr2(String str, int i)
	{
		if (i == 0) {
			return str.substring(1);
		} else if (i == str.length()) {
			return str.substring(0, str.length()-2);
		}
	    StringBuilder sb = new StringBuilder();
		sb.append(str.substring(0, i));
		sb.append(str.substring(i+1));
		return sb.toString();
	}

	private static int count(String str)
	{
		if(intMap2.containsKey(str)){
			return intMap2.get(str);
		}
		int ans = 0;
		char c[] = str.toCharArray();
		int n = c.length;
		for (int i = 0; i < n; i++)
		{
			if (i % 2 ==0) {
				if (c[i] == '1') ans +=1;
			}
		}
		intMap2.put(str, ans);
		return ans;
	}
}
