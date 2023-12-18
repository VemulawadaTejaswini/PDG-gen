import java.io.*;
import java.util.*;
/**
 * @author Rick
 *
 */
class City
{
	int Prefecture;
	int Year;
}

public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("T02CityID.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken().trim());
		int M=Integer.parseInt(st.nextToken().trim());
		Map<Integer,ArrayList<Integer>> PrefectureYears=new HashMap<Integer,ArrayList<Integer>>();
		City[] cities = new City[M];
		for(int i=0;i<M;i++)
		{
			st = new StringTokenizer(br.readLine());
			int p=Integer.parseInt(st.nextToken().trim());
			int y=Integer.parseInt(st.nextToken().trim());
			cities[i]=new City();
			cities[i].Prefecture=p;
			cities[i].Year=y;
			if(!PrefectureYears.containsKey(p))
			{
				ArrayList<Integer> years=new ArrayList<Integer> ();
				years.add(y);
				PrefectureYears.put(p, years);
			}
			else
			{
				PrefectureYears.get(p).add(y);
				Collections.sort(PrefectureYears.get(p));
			}
	    }
	
		for(int i=0;i<M;i++)
		{
			int p= cities[i].Prefecture;
			int y= cities[i].Year;
			String pId=String.valueOf(p);
			StringBuilder sb = new StringBuilder();
			for(int z=0;z<=6-pId.length();z++)
			{
				sb.append("0");
			}
			sb.append(pId);
			int yIDint = PrefectureYears.get(p).indexOf(y)+1;

					String yID=String.valueOf(yIDint);
					for(int t=0;t<=6-yID.length();t++)
					{
						sb.append("0");
					}
					sb.append(yID);							
			System.out.println(sb.toString());
		}
	}
}
