import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]) throws IOException{

	int x=0;
	int y=0;
	int i=0;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	String delimiter = " ";
        StringTokenizer stringTokenizer = new StringTokenizer( str, delimiter );
	while(stringTokenizer.hasMoreTokens())
	{
            String current = stringTokenizer.nextToken();
	    if(i==0)x=Integer.parseInt(current);
	    if(i==1)y=Integer.parseInt(current);
	    i++;
	}

	
	System.out.println(x*y+" "+(x+y)*2);
    }
}