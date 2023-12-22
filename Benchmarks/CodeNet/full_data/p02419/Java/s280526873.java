import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	
	public static void main(String[] args) throws IOException
	{
		int n=0,nCount=0;
		int nWordLength;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		
		StringBuffer sb = new StringBuffer();
		
		String strW = br.readLine();// get word
		
		while(true)
		{
			String strT = br.readLine();// get text line
			
			if(strT.equals("END_OF_TEXT") || strT == null)//sb.equals("END_OF_TEXT") 
			{
				break;
			}
			
			sb.append(strT.toLowerCase() );
			
		}
		
		
		nWordLength = strW.length();
		
		while(true)
		{
		    int index = sb.indexOf(strW,n);
		    
			if(index == -1) break;//not found word
			else
			{
			    n = index + nWordLength;
			    nCount++;
			}
		}
		
		System.out.println(nCount);
	}
}