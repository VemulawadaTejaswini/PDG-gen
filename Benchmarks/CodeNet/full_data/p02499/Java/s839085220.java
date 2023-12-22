import java.util.*;
import java.io.*;
public class Main 
{
	public static void main(String[] args) 
	{
		try
		{
			int[] num = new int[26];
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = br.readLine()) != null)
            {
            	for(int i = 0; i < line.length(); ++i)
            	{
            		if('a' <= line.charAt(i) && line.charAt(i) <= 'z')
            		{
            			++num[line.charAt(i) - 'a'];
            		}
            		else if('A' <= line.charAt(i) && line.charAt(i) <= 'Z')
            		{
            			++num[line.charAt(i) - 'A'];
            		}
            	}
            }
           	br.close();
           	for(int i = 0; i < num.length; ++i)
           	{
           		System.out.println((char)(i + 'a') + " : " + num[i]);
           	}
		}
		catch(Exception e)
		{
			e.getStackTrace();
			System.exit(-1);
		}
	}
}