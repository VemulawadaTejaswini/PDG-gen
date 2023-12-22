import java.io.*;

public class Main 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=0, H=0, n=0;
		char t_chr, h_chr;
		String[] animal = new String[2];
		n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++)
		{
			animal = br.readLine().split(" ");
			t_chr = animal[0].charAt(0);
			h_chr = animal[1].charAt(0);
			if(t_chr>h_chr)	T = T + 3;
			else if(t_chr<h_chr)	H = H + 3;
			else
			{
				T++;
				H++;
			}
			
		}
		System.out.println(T + " " + H);
	}
}

