import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception
	{
		String strRing3 = "56215621";
		String strRing5 = "63146314";
		String strRing6 = "54235423";
		String strRing1 = "24532453";
		String strRing2 = "64136413";
		String strRing4 = "51265126";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		String[] strDice = br.readLine().split(" ");
		int q = Integer.parseInt(br.readLine() );

		for(int i=0; i<q; i++)
		{
			String[] str = br.readLine().split(" ");

			String strB = Integer.toString(7 - Integer.parseInt(str[0]) );
			String strBST = strB + str[1] + str[0];

			if(-1 < strRing3.indexOf(strBST) )
			{
				System.out.println(strDice[3-1]);
			}
			else if(-1 < strRing5.indexOf(strBST) )
			{
				System.out.println(strDice[5-1]);
			}
			else if(-1 < strRing6.indexOf(strBST) )
			{
				System.out.println(strDice[6-1]);
			}
			else if(-1 < strRing1.indexOf(strBST) )
			{
				System.out.println(strDice[1-1]);
			}
			else if(-1 < strRing2.indexOf(strBST) )
			{
				System.out.println(strDice[2-1]);
			}
			else if(-1 < strRing4.indexOf(strBST) )
			{
				System.out.println(strDice[4-1]);
			}

		}

	}
}