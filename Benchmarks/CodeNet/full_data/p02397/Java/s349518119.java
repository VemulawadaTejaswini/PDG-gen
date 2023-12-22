import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]) throws IOException{
	int i=0,x=0,y=0,tmp=0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	for(;;)
	{
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
	    if(x==0 && y==0)break;
	    if(x>y){
		tmp=x;
		x=y;
		y=tmp;
	    }
	    System.out.println(x+" "+y);
	}
    }
}