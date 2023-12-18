
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {


  static class Node{
    int label;
    List<Node> nodes = new LinkedList<>();
    int dist;
    Node(int label){
      this.label = label;
    }

  }

  static Map<String,Integer> map = new HashMap<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();

    List<Node> nodeList = new ArrayList();
    Node root = new Node(0);
    nodeList.add(root);
    for (int i = 1; i < N; i++) {
        Node newNode = new Node(i);
        nodeList.add(newNode);
        root.nodes.add(newNode);
        newNode.nodes.add(root);
        root = newNode;
    }

    nodeList.get(X-1).nodes.add(nodeList.get(Y-1));
    nodeList.get(Y-1).nodes.add(nodeList.get(X-1));

    for (int i = 0; i < N ; i++) {
        bfs(nodeList.get(i));
    }

    Map<Integer, List<String> > result = new HashMap<>();

    for (Map.Entry<String,Integer> e : map.entrySet()) {
      String label = e.getKey();
      Integer dis = e.getValue();

      if(!result.containsKey(dis)){
        List l = new ArrayList();
        l.add(label);
        result.put(dis,l);
      }else{
        result.get(dis).add(label);
      }
    }

    for (int i = 1; i < N ; i++) {
      if(result.containsKey(i)){
        System.out.println(result.get(i).size());
      }else{
        System.out.println(0);
      }

    }

  }

  private static void bfs(Node node){

      Queue<Node> q = new LinkedList<>();
      Set<Node> visited = new HashSet<>();
      node.dist=0;
      q.offer(node);
      visited.add(node);
      while(!q.isEmpty()){
        Node n = q.remove();
        for(Node next : n.nodes){
          if(visited.contains(next)) continue;
          next.dist = n.dist+1;
          q.offer(next);
          visited.add(next);

          int i=node.label;
          int j=next.label;

          if(i>j){
            int temp = i;
            i =j; j = temp;
          }

          String key = i +"-"+ j;
          if(!map.containsKey(key)){
            map.put(key,next.dist);
          }else{
            map.put(key,Math.min(next.dist,map.get(key)));
          }
        }
      }
  }

}
