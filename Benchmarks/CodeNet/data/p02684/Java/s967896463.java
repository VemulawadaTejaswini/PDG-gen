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
         long K = Long.parseLong(st.nextToken());
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken())-1;
         boolean[] seen = new boolean[N];
         seen[0] = true;
         int head = -1;
         int[] dist = new int[N];
         Queue<Integer> q = new LinkedList<Integer>();
         q.add(0);
         while(q.size() > 0)
         {
            int curr = q.poll();
            int next = arr[curr];
            if(!seen[next])
            {
               q.add(next);
               seen[next] = true;
               dist[next] = dist[curr]+1;
            }
            else
               head = next;
         }
         if(K < dist[head])
         {
            q = new LinkedList<Integer>();
            q.add(0);
            while(q.size() > 0 && K > 0)
            {
               int curr = q.poll();
               int next = arr[curr];
               if(!seen[next])
                  q.add(next);
               K--;
            }
            System.out.println(q.poll()+1);
         }
         else
         {
            K -= dist[head];
            ArrayList<Integer> path = new ArrayList<Integer>();
            path.add(head);
            int curr = arr[head];
            while(curr != head)
            {
               path.add(curr);
               curr = arr[curr];
            }
            K %= path.size();
            System.out.println(path.get((int)K)+1);
         }
      }
   }