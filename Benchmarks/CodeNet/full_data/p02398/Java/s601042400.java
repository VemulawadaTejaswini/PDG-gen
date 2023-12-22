import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]) throws IOException{

	int a=0;
	int b=0;
	int c=0;
	int i=0;
	int k=0;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	String delimiter = " ";
        StringTokenizer stringTokenizer = new StringTokenizer( str, delimiter );
	while(stringTokenizer.hasMoreTokens())
	{
            String current = stringTokenizer.nextToken();
	    if(i==0)a=Integer.parseInt(current);
	    if(i==1)b=Integer.parseInt(current);
	    if(i==2)c=Integer.parseInt(current);
	    i++;
	}
	for(int j=a;j<=b;j++){
	    if(c%j==0){
		k++;
	    }
	}
	System.out.println(k);
    }
}