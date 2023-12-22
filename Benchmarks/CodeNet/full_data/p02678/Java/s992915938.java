import java.util.*;

public class Main{
  public static void main( String args[] ){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    ArrayList<ArrayList<Integer>> e = new ArrayList<ArrayList<Integer>>();
    for( int i = 0; i < N; i++ ){
      e.add(new ArrayList<Integer>());
    }
    
    int u,v;
    for( int i = 0; i < M; i++ ){
      u = sc.nextInt()-1;
      v = sc.nextInt()-1;
      e.get(u).add(v);
      e.get(v).add(u);
    }
    
    int[] s = new int[N];
    for( int i = 0; i < N; i++ ){ s[i] = -1; };
    Queue<Integer> q = new ArrayDeque<>();
    
    q.add(0);
    s[0] = 0;
    
    while(!q.isEmpty()){
      int from = q.poll();
      for( int to : e.get(from) ){
        if( s[to] == -1 ){
          q.add(to);
          s[to] = from;
        }
      } 
    }
    
    System.out.println("Yes");
    
    for( int i = 1; i < N; i++ ){
      System.out.println(s[i]+1);
    }
    
  }
}