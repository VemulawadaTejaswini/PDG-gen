package vol_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class RightTriangle
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> strLst = new ArrayList<String>();
		int cnt = 0;
		int max;
		int other;
		String inputLine = "";
		String[] lines;

		br.readLine();
		while (cnt <= 1000 && (inputLine = br.readLine()) != null)
		{
			max = 0;
			other = 0;
			lines = inputLine.split(" ");
			
			for (int i = 0; i < 3; ++i)
			{
				other += (int) Math.pow(Integer.parseInt(lines[i]), 2);
				if (max < Integer.parseInt(lines[i]))
				{
					max = (int) Math.pow(Integer.parseInt(lines[i]), 2);
				}
			}
			other -= max;

			if (other == max)
				strLst.add("YES");
			else
				strLst.add("NO");

			++cnt;
		}
		
		for(String result : strLst)
		{
			System.out.println(result);
		}

	}

}