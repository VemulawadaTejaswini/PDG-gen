import java.util.*;

/**
 * @author masayamatu
 * 
 */
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    Graph[] graph = new Graph[n+1];
    for(int i = 0; i < n+1; i++) {
      graph[i] = new Graph();
    }
    for(int i = 1; i < n; i++) {
      int a = sc.nextInt(); int b = sc.nextInt();
      graph[a].child.add(b);
    }
    for(int i = 0; i < q; i++) {
      int a = sc.nextInt(); int b = sc.nextInt();
      dfs(graph,a,b);
      } 
    for(int i = 1; i < n+1; i++) {
      System.out.println(graph[i].value+ " ");
    }
  }
  
  public static class Graph{
      int  value=0;
      List<Integer> child = new ArrayList<>();
  }
  public static void dfs(Graph[] graph,int idx,int value) {
        graph[idx].value += value;
          for(Integer child:graph[idx].child) {
          dfs(graph,child,value); 
          }           
      }      
}