import java.io.*;

class Main{
	public static void main (String[ ] args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		String str = br.readLine();
		int n = Integer.parseInt(str);

		for(int i = 1; i <= n; i++)
		{
			if(0 == i % 3)
			{
				System.out.print(" " + i);
			}
			else if(3 == i % 10)
			{
				System.out.print(" " + i);
			}
		}
		System.out.println("");
	}
}