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
         LinkedList<Integer>[] edges = new LinkedList[N+1];
         for(int i=1; i <= N; i++)
            edges[i] = new LinkedList<Integer>();
         arr = new int[N+1];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i+1] = Integer.parseInt(st.nextToken());
         compress(arr);
         for(int i=2; i <= N; i++)
         {
            st = new StringTokenizer(infile.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            edges[a].add(b);
            edges[b].add(a);
         }
         dp = new SegmentTree(0, 1000001);
         res = new int[N+1];
         dfs1(1, edges, 0);
         StringBuilder sb = new StringBuilder();
         for(int i=1; i <= N; i++)
            sb.append(res[i]+"\n");
         System.out.print(sb);
      }
      static int[] arr;
      static SegmentTree dp;
      static int L = 0;
      static long M = 0L;
      static long[] map;
      static int[] res;
      public static void dfs1(int curr, LinkedList<Integer>[] edges, int par)
      {
         int val = dp.query(0, arr[curr])+1;
         int past = dp.query(arr[curr],arr[curr]);
         dp.update(arr[curr], Math.max(val, past));
         res[curr] = Math.max(res[curr], Math.max(val,past));
         for(int next: edges[curr])
            if(next != par)
               dfs1(next, edges, curr);
         dp.update(arr[curr], past);
      }
      public static void compress(int[] arr)
      {
         ArrayList<Integer> ls = new ArrayList<Integer>();
         for(int x: arr)
            ls.add(x);
         Collections.sort(ls);
         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
         int boof = 1;
         for(int x: ls)
            if(!map.containsKey(x))
               map.put(x, boof++);
         for(int i=0; i < arr.length; i++)
            arr[i] = map.get(arr[i]);
      }
   }
   class SegmentTree 
   {
        //range max query, non lazy
        final int[] val;
        final int treeFrom;
        final int length;
    
        public SegmentTree(int treeFrom, int treeTo) 
        {
            this.treeFrom = treeFrom;
            int length = treeTo - treeFrom + 1;
            int l;
            for (l = 0; (1 << l) < length; l++);
            val = new int[1 << (l + 1)];
            this.length = 1 << l;
        }
        public void update(int index, int delta) 
        {
            int node = index - treeFrom + length;
            val[node] = delta;
            for (node >>= 1; node > 0; node >>= 1) 
                val[node] = Math.max(val[node << 1], val[(node << 1) + 1]);
        }
        public int query(int from, int to) 
        {
            if (to < from)
                return 0;
            from += length - treeFrom;
            to += length - treeFrom + 1;
            int res = 0;
            for (; from + (from & -from) <= to; from += from & -from) 
                res = Math.max(res, val[from / (from & -from)]);
            for (; to - (to & -to) >= from; to -= to & -to)
                res = Math.max(res, val[(to - (to & -to)) / (to & -to)]);
            return res;
        }
   }