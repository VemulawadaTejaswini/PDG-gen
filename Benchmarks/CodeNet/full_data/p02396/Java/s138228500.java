import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]) throws IOException{
	int w=1;
	int i=0,j=0;
	while(w>0)
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    j=Integer.parseInt(str);
	    i++;
	    if(j==0)break;
	    System.out.println("Case "+i+": "+j);
	}
    }
}