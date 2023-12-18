import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
public class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static int tc=1;
    static String[] s;
 
    public static long[] ila(String[] s){
        long[] array=new long[s.length];
        for(int i=0;i<array.length;i++)
            array[i]=Long.parseLong(s[i]);
        return array;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        //tc=Integer.parseInt(br.readLine());
        t:
        while(tc-->0){
		  int k=Integer.parseInt(br.readLine());
		  String s=br.readLine();
		  StringBuilder sb=new StringBuilder("");
		  for(int i=0;i<s.length();i++){
		  	char x=s.charAt(i);
		  	x=(char)(x+k);
		  	if(x>90)
		  		x=(char)(64+(x%90));
		  	//System.out.println((int)x);
		  	sb.append(x);
		  }
		  System.out.println(sb);
        }
    }
}