import java.io.*;
import java.util.*;

/**
 * @author masayamatu
 * 
 */
public class Main {
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st;
    
    st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());
    Graph[] graph = new Graph[n+1];
    for(int i = 0; i < n+1; i++) {
      graph[i] = new Graph();
    }
    for(int i = 1; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken()); int b = Integer.parseInt(st.nextToken());
      graph[a].child.add(b);
      graph[b].parent = a;
    }
    for(int i = 0; i < q; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken()); int b = Integer.parseInt(st.nextToken());
      dfs(graph,a,b);
      } 
    for(int i = 1; i < n+1; i++) {
      System.out.println(graph[i].value+ " ");
    }
  }
  
  public static class Graph{
      int  value=0;
      int  parent;
      List<Integer> child = new ArrayList<>();
  }
  public static void dfs(Graph[] graph,int idx,int value) {
        graph[idx].value += value;
          for(Integer child:graph[idx].child) {
            if(child != graph[child].parent) {
              dfs(graph,child,value); 
            }
          }           
      }      
}