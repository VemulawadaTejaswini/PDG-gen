import java.io.*;
import java.lang.*;

public class Main {
	public static void main(String[] args)  throws IOException
		{
		    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		    int[] count = new int[51];
		    for(int a=0; a<=9; a++){
		    	for(int b=0; b<=9; b++){
		    		for(int c=0; c<=9; c++){
		    			for(int d=0; d<=9; d++){
		    				count[a+b+c+d]++;
		    			}
		    		}
		    	}
		    }
		    int num = Integer.parseInt(buf.readLine());
		    System.out.println(count[num]);
		}
}