import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main{

 /**
  * @param args
  * @throws IOException 
  */
 public static void main(String[] args) throws IOException {
//  8 5
//  -9 -7 -4 -3 1 2 3 4
  BufferedReader xx = new BufferedReader(new InputStreamReader(System.in));
  StringTokenizer in = new StringTokenizer(xx.readLine());
  int N = Integer.parseInt(in.nextToken());
  int M = Integer.parseInt(in.nextToken());  // shen du
  boolean hasZore = false;
  // create node
  in = new StringTokenizer(xx.readLine());
  List<Integer> numbers = new ArrayList<Integer>();
  for (int i = 0; i < N; i++) {
   numbers.add(Integer.parseInt(in.nextToken()));
  }
  
  
  for (Integer integer : numbers) {
   if(integer == 0){
    hasZore = true;
    break;
   }
  }
  
  if(!hasZore){
   numbers.add(0);
  }
  
  Collections.sort(numbers, new Comparator<Integer>() {
   @Override
   public int compare(Integer o1, Integer o2) {
    // TODO Auto-generated method stub
    return o1 > o2 ? 1:-1;
   }
  });
  
  if(numbers.size() == N){
   hasZore = true;
  }
  
  if(hasZore){
   M = M-1;
  }
  
  List<Node> nodelist = generateGragh(N, numbers);

  Gragh gragh = new Gragh();
  gragh.setNodelist(nodelist);
  
  // ji suan quanzhong
  Node zeroNode = new Node();
  for(int index = 0; index<nodelist.size(); index++){
   Node node = nodelist.get(index);
   if(node.getId() == 0){
    zeroNode = node;
    break;
   }
  }
  
  List<Edge> edgelist = zeroNode.getEdgelist();
  for (Edge edge : edgelist) {
   int nextPointId = edge.endnodeid;
   for (Node sumnode : nodelist) {
    if(sumnode.getId() == nextPointId){
     break;
    }
   }
  }
  
  System.out.println(gragh.getNodelist());
  System.out.println(gragh.getNodelist().size());
 }

 

 private static List<Node> generateGragh(int N, List<Integer> numbers) {
  List<Node> nodelist = new ArrayList<Node>();
  for(int i=0; i<N; i++){
   Node node =  new Node();
   node.setId(numbers.get(i));
   
   List<Edge> edgelist = new ArrayList<Edge>();
   Edge rEdge = new Edge();
   Edge lEdge = new Edge();
   
   if(i == 0){
    rEdge.startnodeid = numbers.get(i);
    rEdge.endnodeid = numbers.get(i+1);
    rEdge.weight = Math.abs(numbers.get(i+1) - numbers.get(i));
    edgelist.add(rEdge);
   } else if( i== N -1){
    lEdge.startnodeid = numbers.get(i);
    lEdge.endnodeid = numbers.get(i-1);
    lEdge.weight = Math.abs(numbers.get(i)-numbers.get(i-1));
    edgelist.add(lEdge);
   } else {
    rEdge.startnodeid = numbers.get(i);
    rEdge.endnodeid = numbers.get(i+1);
    rEdge.weight = Math.abs(numbers.get(i+1)-numbers.get(i));

    lEdge.startnodeid = numbers.get(i);
    lEdge.endnodeid = numbers.get(i-1);
    lEdge.weight = Math.abs(numbers.get(i)-numbers.get(i-1));
    edgelist.add(rEdge);
    edgelist.add(lEdge);
   }
   node.setEdgelist(edgelist);
   nodelist.add(node);
  }
  return nodelist;
 }
 
 

}

class Edge{
 public int startnodeid;
 public int endnodeid;
 public int weight;
 @Override
 public String toString() {
  return "Edge [startnodeid=" + startnodeid + ", endnodeid=" + endnodeid
    + ", weight=" + weight + "]";
 }
 
}

/**
 * Node
 * @author wch.wu
 *
 */
class Node{
 private int id;
 private List<Edge> edgelist;
 
 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
 }
 public List<Edge> getEdgelist() {
  return edgelist;
 }
 public void setEdgelist(List<Edge> edgelist) {
  this.edgelist = edgelist;
 }
 @Override
 public String toString() {
  return "Node [id=" + id + ", edgelist=" + edgelist + "]";
 }
 
}

class Gragh{
 
 public List<Node> nodelist = null;
 
 public Gragh(){
  nodelist = new ArrayList<Node>();
 }

 public List<Node> getNodelist() {
  return nodelist;
 }

 public void setNodelist(List<Node> nodelist) {
  this.nodelist = nodelist;
 }
}
