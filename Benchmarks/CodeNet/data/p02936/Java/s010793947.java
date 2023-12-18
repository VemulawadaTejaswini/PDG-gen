import java.util.*;
import java.io.*;

public class Main
{
  static int[] sum = new int[200000];
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(tokenizer1.nextToken());
    int q = Integer.parseInt(tokenizer1.nextToken());
    
    int[][] matrix = new int[n][n];
    int c1,c2;
    
    for(int i=0;i<n-1;i++)
    {
      StringTokenizer tokenizer2 = new StringTokenizer(br.readLine());
       c1  = Integer.parseInt(tokenizer2.nextToken());
       c2 = Integer.parseInt(tokenizer2.nextToken());
      
      matrix[c1][c2] = 1;
    }
    
    
    for(int i=0;i<q;i++)
    {
       StringTokenizer tokenizer3 = new StringTokenizer(br.readLine());
       c1  = Integer.parseInt(tokenizer3.nextToken());
       c2 = Integer.parseInt(tokenizer3.nextToken());
       BFS(new Pair(c1,c2),matrix,n);
       
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(sum[i]+" ");
    }
  }
  
  public static void BFS(Pair pair,int[][] matrix,int size)
  {
     LinkedList<Integer> adj[];
    adj = new LinkedList[size]; 
        for (int i=0; i<size; ++i) 
            adj[i] = new LinkedList();
    for(int i=0;i<size;i++)
    {
      for(int j=0;j<size;j++)
      {
        if(matrix[i][j] == 1)
        {
          adj[i].add(j);
        }
      }
    }
    boolean[] visited = new boolean[size];
    LinkedList<Integer> queue = new LinkedList<Integer>();
    visited[pair.node] = true;
    queue.add(pair.node);
    int value = pair.value;
    int s;
    
    while(queue.size() != 0)
    {
      s = queue.poll();
      sum[s] += value;
      Iterator<Integer> it =  adj[s].listIterator();
      while(it.hasNext())
      {
        int n1 = it.next();
        if(!visited[n1])
        {
          visited[n1] = true;
          queue.add(n1);
        }
      }
      
    }
  }
}

class Pair
{
  public int node;
  public int value;
  Pair(int node,int value)
  {
    this.node = node;
    this.value = value;
  }
}