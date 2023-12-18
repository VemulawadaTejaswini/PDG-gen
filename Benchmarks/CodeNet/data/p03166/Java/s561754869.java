import java.util.*;
import java.io.*;
class Main{
  public static void main(String arg[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String inps[] = br.readLine().split(" ");
    int n = Integer.parseInt(inps[0]);
    int m = Integer.parseInt(inps[1]);
    ArrayList <Integer> graph[] = new ArrayList[n];
    for(int i=0;i<n;i++)
      graph[i] = new ArrayList <Integer>();
    
    boolean not_source[] = new boolean[n];
    for(int i=0;i<m;i++){
      inps = br.readLine().split(" ");
      int x = Integer.parseInt(inps[0]) - 1;
      int y = Integer.parseInt(inps[1]) - 1;
      graph[x].add(y);
      not_source[y] = true;
    }
    Queue <Node> bfs = new LinkedList();
    for(int i=0;i<n;i++)
      if(!not_source[i]) bfs.add(new Node(i,1));
    int max_depth = 1;
    Node temp [] = new Node[n];
    for(int i=0;i<n;i++) temp[i] = new Node(i,1);
    while(!bfs.isEmpty()){
      Node curr = bfs.poll();
      for(int i=0;i<graph[curr.index].size();i++){
        Node c_temp = temp[graph[curr.index].get(i)];
        if(c_temp.depth < curr.depth + 1){
          c_temp.depth = curr.depth + 1;
        	bfs.add(c_temp);
        }
        max_depth = Math.max(max_depth, curr.depth + 1);
      }
    }
    
    System.out.println(max_depth-1);
    }
}
class Node{
  int depth;
  int index;
  public Node(int i, int d){
    depth = d;
    index = i;
  }
}