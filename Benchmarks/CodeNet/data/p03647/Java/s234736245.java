/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    ArrayList<Integer>[] adj = new ArrayList[n];
    for(int i=0;i<n;i++) adj[i] = new ArrayList<Integer>();

    for(int i=0;i<m;i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      adj[a].add(b);
      adj[b].add(a);
    }

    Queue<Integer> q = new LinkedList<Integer>();
    q.add(1);
    int cnt = 0;

    boolean[] vis = new boolean[n];

    bfs:
    while(!q.isEmpty()) {
        int cur = q.poll();
        for(int next : adj[cur]) {
          if(next == n - 1) {
            break bfs;
          }
          if(!vis[next]) {
            cnt++;
          }
        }
    }

    System.out.println(cnt == 2 ? "POSSIBLE" : "IMPOSSIBLE");
  }
}
