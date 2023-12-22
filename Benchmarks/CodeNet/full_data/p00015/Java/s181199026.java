import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++)
		{
		    StringBuffer s1 = new StringBuffer(br.readLine());
		    StringBuffer s2 = new StringBuffer(br.readLine());
  
		    if(s1.length() > 80 || s2.length() > 80)
			System.out.println("overflow");
		    else if ((s1.length() < 10) && (s2.length() < 10)) {
			System.out.println(Integer.parseInt(s1.toString()) + 
					   Integer.parseInt(s2.toString()));
		    } else {	
			StringBuffer s3 = cal(s1,s2);
			char[] budget = s3.toString().toCharArray();
			int m = budget.length;
			if( m > 80 ) System.out.println("overflow");
			else {
			    for(int j=0; j<m; j++)
			    System.out.print(Integer.parseInt(budget[j]+""));
			    System.out.println();
			}
		    }
		 }
	}

	private static StringBuffer cal(StringBuffer a, StringBuffer b)
	{
		a.reverse();
		b.reverse();
		int lenA = a.length(), lenB = b.length(), max = Math.max(lenA,lenB);
		int roundup=0; //determine whether round up is needed
		StringBuffer c = new StringBuffer();
		Integer temp=0;
		for(int i=0; i<max; i++)
		{
		    if( i < lenA && i < lenB) {
		        temp = Integer.parseInt(a.substring(i,i+1).toString()) + 
			       Integer.parseInt(b.substring(i,i+1).toString()) + 
			       roundup;
		    } else if( i < lenA && i >= lenB) {
			temp = Integer.parseInt(a.substring(i,i+1).toString()) + roundup;
		    } else {
			temp = Integer.parseInt(b.substring(i,i+1).toString()) + roundup;
		    }
		
		    if(temp>9) {roundup = 1; temp-=10;}
		    else       roundup = 0;
		    c.append(temp);
		    if(i==max-1 && roundup == 1)
			c.append(1);
		}
		return c.reverse();
	}
}