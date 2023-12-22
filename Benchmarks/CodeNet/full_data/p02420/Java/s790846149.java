import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main
{
	public static void main(String[] args)
	{
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			while(!((str =  br.readLine()).equals("-"))){
				int M = Integer.parseInt(br.readLine());
				int[] arrH = new int[M];
				for(int i = 0; i< M ; i++)
				{
					arrH[i] = Integer.parseInt(br.readLine());
				}
				shuff(str,arrH,M);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void shuff(String s , int[] h , int l)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		for(int i = 0 ; i < l ; i++)
		{
			sb.append(sb.substring(0,h[i]));
			sb.delete(0,h[i]);
		}
		System.out.println(sb.toString());
	}
}