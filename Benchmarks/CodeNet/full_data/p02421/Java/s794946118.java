import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
			if(animal[0]==animal[1])
			{
				T++;
				H++;
				continue;
			}
			for(int j=0; j<animal[0].length(); j++)
			{
				t_chr = animal[0].charAt(j);
				h_chr = animal[1].charAt(j);
				if(t_chr>h_chr)
				{
					T = T + 3;
					break;
				}
				else if(t_chr<h_chr)
				{
					H = H + 3;
					break;
				}
				else if(j==animal[0].length()-1)
				{
					if(animal[0].length()>animal[1].length())	T = T + 3;
					else		H = H + 3;
				}
			}
		}
		System.out.println(T + " " + H);
	}
}
