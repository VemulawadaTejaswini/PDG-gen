								//package Dynamic;
import java.io.*;
import java.util.*;
class Main
{
    static public void main(String[] args) throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int ar[]=new int[n];
      StringTokenizer st=new StringTokenizer(br.readLine());
//        int a=Integer.parseInt(st.nextToken());
//        int b=Integer.parseInt(st.nextToken());
//        int c=Integer.parseInt(st.nextToken());
        //int d=Integer.parseInt(st.nextToken());
       int i=0;
        while(st.hasMoreTokens())
        {
        	ar[i++]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ar);
        int aa=ar[n/2-1];
        int bb=ar[n/2];
        System.out.println(bb-aa);
//        for(int x=0;x<n;x++)
//        {
//        	
//        }
        
        
    }
}
