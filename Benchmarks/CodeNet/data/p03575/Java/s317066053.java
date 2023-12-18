import java.util.*;

public class Main {            
    
  static int N;
  
  public static class Node{
    ArrayList<Integer> to;
    boolean visit;
    Node(){
        to = new ArrayList<Integer>();
        visit = false;
    }        
  }  

static Node[] node = new Node[1000000];

  public static void main(String[] args){
      
      Scanner sc =new Scanner(System.in);
     
       int N = sc.nextInt();
       int M = sc.nextInt();
      
       int s[] = new int[M];
       int t[] = new int[M];
       
      for(int i = 0;i < N;i++)
        node[i] = new Node();
       
      for(int i = 0;i < M;i++){
             int a = sc.nextInt();
             int b = sc.nextInt();
             s[i] = a;
             t[i] = b;
             node[a-1].to.add(b-1);
             node[b-1].to.add(a-1);
      }
      
      int count = 0;      
      for(int i = 0;i < M;i++){
          int start = s[i];
          int goal  = t[i];
          node[start-1].to.remove(node[start-1].to.indexOf(goal-1));
          node[goal-1].to.remove(node[goal-1].to.indexOf(start-1));
          if(solve(node[0])){
              count++;
          }
          node[start-1].to.add(goal-1);
          node[goal-1].to.add(start-1);
      }
      
      System.out.println(count);        
      
  }
  
  static boolean solve(Node n){
      for(int i = 0;i < n.to.size();i++){
          int next = n.to.get(i);
          if(node[next].visit)continue;
          node[next].visit = true;
          solve(node[next]);
      }            
      boolean flag = false;
      for(int i = 0;i < N;i++){
          if(!node[i].visit){
              System.out.println("Debug");
              flag = true;
              break;
          }
      }
      return flag;
  }
  
}
     