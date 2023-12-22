import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
   String arr[] = new String[n];
   for(int i=0;i<n;i++)
   {
   		
   		arr[i]=br.readLine();
   }
   Arrays.sort(arr);
   int c=0;
   String uniq="";
   for(int i=0;i<n;i++)
   {
   		if(uniq.indexOf(arr[i])==-1){
   			c++;
   			uniq=uniq+" "+arr[i]; 
   		}
   }
   System.out.println(c);
}
}