import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main{

	public static void main(String[] args) throws Exception
	{
		String[] strRing = {"24532453","64136413","56215621","51265126","63146314","54235423"};
		String strT,strS,strB;
		String strE=null,strW=null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		String[] strDice = br.readLine().split(" ");

		HashMap<String,String> map = new HashMap<String,String>();

		for(int i=0; i<6; i++) map.put(strDice[i],Integer.toString(i+1) );

		String[] str = br.readLine().split(" ");//get 2nd dice

		strT = map.get(str[0]);
		strS = map.get(str[1]);
		strB = Integer.toString(7 - Integer.parseInt(strT) );

		String strBST = strB + strS + strT;

		for(int i=0; i<6; i++)
		{
			if(-1 < strRing[i].indexOf(strBST) )
			{
				strE = Integer.toString(i + 1);
				strW = Integer.toString(6 - i);
			}
		}

		if(strE.equals(map.get(str[2]) ) && strW.equals(map.get(str[3]) )  )
		{
			System.out.println(strB.equals(map.get(str[5]) ) ? "Yes" : "No");
		}
		else
		{
			System.out.println("No");
			System.out.println(strT + strS + strE + strW);
		}

	}
}