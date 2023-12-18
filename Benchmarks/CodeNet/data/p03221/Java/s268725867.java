import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int PiNum = scan.nextInt();
		int Test_case = scan.nextInt();
		
		int inputs[][] = new int [Test_case][2];
		Map<Integer,List<Integer>> map = new TreeMap<Integer,List<Integer>>();
		int piId = 0;
		int cityId = 0;
		for (int i = 0; i < Test_case; i++)
		{
			piId = scan.nextInt();
			cityId = scan.nextInt();
			inputs[i][0] = piId;
			inputs[i][1] = cityId;
			if (map.get(piId) == null)
			{
				List<Integer> li = new ArrayList<Integer>();
				li.add(cityId);
				map.put(piId, li);
			}else{
				
				map.get(piId).add(cityId);
			}
			
		}
		
		Iterator<Integer> it = map.keySet().iterator();
		 
		while(it.hasNext())
		{
			Collections.sort(map.get(it.next()));
			
			//System.out.println(it.next());
		}
		List<Integer> arry = null;
		int index = 0;
		//String result1;
		//String result2;
		for (int i = 0; i <inputs.length ; i++)
		{
			int pi = inputs[i][0];
			arry = map.get(pi);
			index = arry.indexOf(inputs[i][1]);
			
			System.out.println(caclResult(pi)+caclResult(index+1));
		}
		
	}
	
	private static String caclResult (int i)
	{
		String res = "";
		for (int m = 0; m < 6-(i+"").length(); m++)
		{
			res = res +"0";
		}
		
		
		
		return res+i;
	}
	
}
