/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
If I'm the sun, you're the moon
Because when I go up, you go down
*******************************
I'm working for the day I will surpass you
https://www.a2oj.com/Ladder16.html
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         HashMap<Integer, Long> map = new HashMap<Integer, Long>();
	 for(int i=0; i < N; i++)
	 {
	    int x = arr[i]-i;
	    if(!map.containsKey(x)) map.put(x, 0L);
		map.put(x, map.get(x)+1);
	 }
	 long res = 0L;
	 for(int k: map.keySet())
         {
		long v = map.get(k);	res += v*(v-1)/2;
		}
 	System.out.println(res);
      }
}