/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
What do you think? What do you think?
1st on Billboard, what do you think of it
Next is a Grammy, what do you think of it
However you think, I’m sorry, but shit, I have no fcking interest
*******************************
I'm standing on top of my Monopoly board
That means I'm on top of my game and it don't stop
til my hip don't hop anymore
https://www.a2oj.com/Ladder16.html
*******************************
300iq as writer = Sad!
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int Q = Integer.parseInt(st.nextToken());
         StringBuilder sb = new StringBuilder();
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         Query[] queries = new Query[Q];
         for(int i=0; i < Q; i++)
         {
            st = new StringTokenizer(infile.readLine());
            int l = Integer.parseInt(st.nextToken())-1;
            int r = Integer.parseInt(st.nextToken())-1;
            queries[i] = new Query(l, r, i);
         }
         Arrays.sort(queries);
         FenwickTree bit = new FenwickTree(500001);
         int added = 0;
         int[] last = new int[500001];
         Arrays.fill(last, -1);
         int[] res = new int[Q];
         for(int i=0; i < N; i++)
         {
            if(last[arr[i]] != -1)
               bit.add(last[arr[i]]+1, -1);
            last[arr[i]] = i;
            bit.add(i+1, 1);
            while(added < Q && queries[added].right == i)
            {
               res[queries[added].id] = bit.find(queries[added].right+1)-bit.find(queries[added].left); 
               added++;
            }
         }
         for(int i=0; i < Q; i++)
            sb.append(res[i]+"\n");
         System.out.print(sb);
      }
   }
   class Query implements Comparable<Query>
   {
      public int id;
      public int left;
      public int right;
      
      public Query(int a, int b, int i)
      {
         left = a;
         right = b;
         id = i;
      }
      public int compareTo(Query oth)
      {
         return right-oth.right;
      }
   }
   class FenwickTree
   {
      //1 indexed
      public int[] tree;
      public int size;
      
      public FenwickTree(int size)
      {
         this.size = size;
         tree = new int[size+5];
      }
      public void add(int i, int v)
      {
         while(i <= size)
         {
            tree[i] += v;
            i += i&-i;
         }
      }
      public int find(int i)
      {
         int res = 0;
         while(i >= 1)
         {
            res += tree[i];
            i -= i&-i;
         }
         return res;
      }
      public int find(int l, int r)
      {
         return find(r)-find(l-1);
      }
   }