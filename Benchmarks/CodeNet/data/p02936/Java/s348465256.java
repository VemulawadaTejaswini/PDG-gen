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
    String ans = "";
    Graph[] graph = new Graph[n+1];
    for(int i = 0; i < n+1; i++) {
      graph[i] = new Graph();
    }
    for(int i = 1; i < n; i++) {
      int a = sc.nextInt(); int b = sc.nextInt();
      graph[a].addchild(b);
    }
    for(int i = 0; i < q; i++) {
      int a = sc.nextInt(); int b = sc.nextInt();
      Graph.setvalue(graph,a,b);
      } 
    for(int i = 1; i < n+1; i++) {
      System.out.println(graph[i].value+ " ");
    }

  }
  
  public static class Graph{
      int  parent;
      int  value=0;
      List<Integer> child = new ArrayList<>();
      public static void setvalue(Graph[] graph,int idx,int value) {
        graph[idx].value += value;
        if(!graph[idx].child.isEmpty()) {
          for(Integer child:graph[idx].child) {
          setvalue(graph,child,value); 
          }
        }     
      }
      public void addchild(int child) {
        this.child.add(child);
      }
    }
}