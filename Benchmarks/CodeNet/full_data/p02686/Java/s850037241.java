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
         Bracket[] arr = new Bracket[N];
         int res = 0; int bal = 0;
         for(int i=0; i < N; i++)
         {
            String input = infile.readLine();
            res += input.length();
            for(char c: input.toCharArray())
            {
               if(c == '(')
                  bal++;
               else
                  bal--;
            }
            arr[i] = new Bracket(input);
         }
         if(bal != 0)
         {
            System.out.println("No");
            return;
         }
         Arrays.sort(arr);
         int[] dp = new int[100001];
   		Arrays.fill(dp, -1);
   		dp[0] = 0;
   		int[] highest = new int[100001];
   		Arrays.fill(highest, -1);
   		highest[0] = 0;
         for(Bracket bb: arr)
         {
   			if (bb.diff >= 0) 
            {
   				for (int j=dp.length-1; j >= bb.diff; j--) 
               {
   					int prev = j-bb.diff;
   					if (dp[prev] == -1) 
                     continue;
   					if (highest[prev]+bb.low < 0) 
                     continue;
   					if (dp[prev] + bb.total > dp[j]) 
                  {
   						dp[j] = dp[prev] + bb.total;
   						highest[j] = highest[prev] + bb.diff;
   					}
   					else if (dp[prev] + bb.total == dp[j] && highest[prev] + bb.diff > highest[j])
   						highest[j] = highest[prev] + bb.diff;
   				}
   			}
   			else 
            {
   				for (int j=0; j-bb.diff < dp.length; j++) 
               {
   					int prev = j-bb.diff;
   					if (dp[prev] == -1) 
                     continue;
   					if (highest[prev]+bb.low < 0) 
                     continue;
   					if (dp[prev] + bb.total > dp[j]) 
                  {
   						dp[j] = dp[prev] + bb.total;
   						highest[j] = highest[prev];
   					}
   					else if (dp[prev] + bb.total == dp[j] && highest[prev] > highest[j])
   						highest[j] = highest[prev];
   				}
   			}
   		}
         if(res == dp[0])
            System.out.println("Yes");
         else
            System.out.println("No");
      }
   }
   class Bracket implements Comparable<Bracket> 
   {
   	public int open;
   	public int close;
   	public int low;
   	public int total;
   	public int diff;
   
   	public Bracket(String s) 
      {
   		low = 0;
   		open = 0;
   		close = 0;
   		total = s.length();
   		for (int i=0; i < s.length(); i++) 
         {
   			if (s.charAt(i) =='(')
   				open++;
   			else 
            {
   				close++;
   				low = Math.min(low, open-close);
   			}
   		}
   		diff = open-close;
   	}
   	public int compareTo(Bracket other) 
      {
   		if (this.low != other.low)
   			return other.low - this.low;
   		if (this.diff != other.diff)
   			return other.diff - this.diff;
   		return this.total - other.total;
   	}
   }