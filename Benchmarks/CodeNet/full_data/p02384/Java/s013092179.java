import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main{

	public static void main(String[] args) throws Exception
	{
		String strRing1 = "24532453";
		String strRing2 = "64136413";
		String strRing3 = "56215621";
		String strRing4 = "51265126";
		String strRing5 = "63146314";
		String strRing6 = "54235423";

//		String[] strRing = {"24532453","64136413","56215621","51265126","63146314","54235423"};

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		String[] strDice = br.readLine().split(" ");
		int q = Integer.parseInt(br.readLine() );

		HashMap<String,String> map = new HashMap<String,String>();

		for(int i=1; i<=6; i++)
		{
			map.put(strDice[i-1],Integer.toString(i) );
		}

		for(int i=0; i<q; i++)
		{
			String[] str = br.readLine().split(" ");

			String strB = Integer.toString(7 - Integer.parseInt(map.get(str[0]) )  );
			String strBST = strB + map.get(str[1]) + map.get(str[0]);

/*			for(int j=0; j<6; j++)
			{
				if(-1 < strRing[j].indexOf(strBST) ) System.out.println(strDice[j]);
			}*/

			if(-1 < strRing1.indexOf(strBST) )
			{
				System.out.println(strDice[1-1]);
			}
			else if(-1 < strRing2.indexOf(strBST) )
			{
				System.out.println(strDice[2-1]);
			}
			else if(-1 < strRing3.indexOf(strBST) )
			{
				System.out.println(strDice[3-1]);
			}
			else if(-1 < strRing4.indexOf(strBST) )
			{
				System.out.println(strDice[4-1]);
			}
			else if(-1 < strRing5.indexOf(strBST) )
			{
				System.out.println(strDice[5-1]);
			}
			else if(-1 < strRing6.indexOf(strBST) )
			{
				System.out.println(strDice[6-1]);
			}

		}

	}
}