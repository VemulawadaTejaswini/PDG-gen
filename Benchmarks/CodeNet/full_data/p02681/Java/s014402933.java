

import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		String s2=br.readLine();
		
		if(s2.length()-s1.length()==1)
		{
			int flag=1;
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					continue;
				}
				else
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
		else
		{
			System.out.println("No");
		}

	}

}
