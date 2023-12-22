import java.io.*;

class Main
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int S = Integer.parseInt(str);
		
		int h = S/3600;
		int m =	(S-h*3600)/60;
		int s = (S-h*3600-m*60);
		
		System.out.println(h+":"+m+":"+s);
	}
}