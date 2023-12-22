import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String s1;
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		map.put(10, "Ten");
		map.put(11, "Eleven");
		
		ArrayList<String> al=new ArrayList<String>();
		int i=0;
		s1=scan.next();
		while(scan.hasNext()){
			al.add(scan.next());
			if(al.get(i).equals("END_OF_TEXT"))
				break;
			i++;
			
		}
		int s=al.size();
		int c=0;
		for(int m=0;m<s;m++)
		{
			if(al.get(m).equals(s1))
				c++;
		}
		System.out.println(map.get(c));
	}
}