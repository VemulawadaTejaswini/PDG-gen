import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			LinkedList<String> list = new LinkedList<String>();
			list.clear();
			while(true)
			{
				String s = in.readLine();
				if(s != null && !s.equals("0"))
				{
					for(int i = 0; i < Integer.valueOf(s); i++)
					{
						String str = in.readLine();
						list.add(str);
					}
					break;
				}
				break;
			}
			int pointA = 0;
			int pointB = 0;
			for(String s : list)
			{
				String[] cards = getSplitStrings(s);
				pointA += getPoint(cards[0], cards[1]);
				pointB += getPoint(cards[1], cards[0]);
			}
			System.out.println(pointA+" "+pointB);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static int getPoint(String string1, String string2)
	{
		if(string1.equals(string2))
		{
			return 1;
		}
		LinkedList<String> list = new LinkedList<String>();
		list.clear();
		list.add(string1);
		list.add(string2);
		Collections.sort(list);
		if(list.get(0).equals(string1))
		{
			return 0;
		} else
		{
			return 3;
		}
	}

	private static String[] getSplitStrings(String s)
	{
		LinkedList<String> relist = new LinkedList<String>();
		relist.clear();
		StringTokenizer sz = new StringTokenizer(s);
		while(sz.hasMoreTokens())
		{
			relist.add(sz.nextToken());
		}
		String[] result = new String[relist.size()];
		for(int i = 0; i < result.length; i++)
		{
			result[i] = relist.get(i);
		}
		return result;
	}

	private static double getDevideChild(double[] scores, double average)
	{
		double result = 0D;
		for(int i = 0; i < scores.length; i++)
		{
			result += Math.pow((scores[i] - average), 2D);
		}
		return result;
	}

	private static double getAverage(double[] scores)
	{
		double result = 0D;
		for(int i = 0; i < scores.length; i++)
		{
			result += scores[i];
		}
		return (result /= scores.length);
	}

	private static double getDistance(double[] points)
	{
		double dx0 = points[0];
		double dy0 = points[1];
		double dx1 = points[2];
		double dy1 = points[3];
		double dx = dx1 - dx0;
		double dy = dy1 - dy0;
		return Math.sqrt(dx*dx+dy*dy);
	}

	private static double[] getParsedDoublea(String s)
	{
		StringTokenizer sz = new StringTokenizer(s);
		ArrayList<Double> reslist = new ArrayList<Double>();
		while(sz.hasMoreTokens())
		{
			reslist.add(Double.valueOf(sz.nextToken()));
		}
		double[] result = new double[reslist.size()];
		for(int i = 0; i < result.length; i++)
		{
			result[i] = reslist.get(i);
		}
		return result;
	}

	private static String shuffle(String reg, int i)
	{
		System.out.println(reg+" to "+reg.substring(i, reg.length()) + reg.substring(0, i));
		return reg.substring(i, reg.length()) + reg.substring(0, i);
	}

	private static int[] getCharCounts(String s)
	{
		int[] result = new int['z'-'a'+1];
		for(int i = 0; i < s.length(); i++)
		{
			Character c = s.charAt(i);
			if(Character.isLetter(c))
			{
				c = Character.toLowerCase(c);
				int num = (int)c - 'a';
				result[num]++;
			}
		}
		return result;
	}

	private static int getCount(String s)
	{
		int result = 0;
		for(int i = 0; i < s.length(); i++)
		{
			result += Integer.valueOf(s.substring(i, i+1));
		}
		return result;
	}

	private static String getParsedString(String s)
	{
		String result = "";
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(Character.isLowerCase(c))
			{
				c = Character.toUpperCase(c);
			} else
			if(Character.isUpperCase(c))
			{
				c = Character.toLowerCase(c);
			}
			result += c;
		}
		return result;
	}

	private static int getCount(int num, int max)
	{
		int result = 0;
		LinkedList<String> buffer = new LinkedList<String>();
		buffer.clear();
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= num; j++)
			{
				for(int k = 1; k <= num; k++)
				{
					if(i + j + k == max && nEq(i, j, k))
					{
						int[] res = getSorted(i, j, k);
						String s = String.valueOf(res[0]+","+res[1]+","+res[2]);
						if(!buffer.contains(s))
						{
							buffer.add(s);
							result++;
						}
					}
				}
			}
		}
		return result;
	}

	private static boolean nEq(int i, int j, int k)
	{
		return i != j && i != k && j != k;
	}

	private static int[] getSorted(int ... param)
	{
		for(int i = 0; i < param.length - 1; i++)
		{
			for(int j = 0; j < param.length - 1 - i; j++)
			{
				if(param[j] > param[j+1])
				{
					param = swap(param.clone(), j, j+1);
				}
			}
		}
		return param;
	}

	private static int[] swap(int[] param, int i, int j)
	{
		int tmp = param[i];
		param[i] = param[j];
		param[j] = tmp;
		return param;
	}

	public static int[] getSpritIntegers(String s) throws Exception
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.clear();
		StringTokenizer sz = new StringTokenizer(s);
		while(sz.hasMoreTokens())
		{
			list.add(Integer.valueOf(sz.nextToken()));
		}
		int[] result = new int[list.size()];
		for(int i = 0; i < list.size(); i++)
		{
			result[i] = list.get(i);
		}
		return result;
	}
}