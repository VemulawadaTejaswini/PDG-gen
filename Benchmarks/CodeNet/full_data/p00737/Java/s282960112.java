import java.util.*;

public class Main{
  static int h,w;
  static int dx[] = {0,1,0,-1};
  static int dy[] = {-1,0,1,0};

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      w = sc.nextInt();
      h = sc.nextInt();
      if(w == 0 && h == 0) break;

      int[][] t = new int[h][w];

      for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          t[i][j] = sc.nextInt();
        }
      }

      int[] change = new int[4];
      for(int i=0;i<4;i++){
        change[i] = sc.nextInt();
      }

      PriorityQueue<State> open = new PriorityQueue<State>();
      HashSet<State> closed = new HashSet<State>();
      open.add(new State(0,0,1,0));

      State ans = null;

      while(!open.isEmpty()){
        State st = open.poll();
        if(closed.contains(st)) continue;
        closed.add(st);

        if(st.x == w-1 && st.y == h-1){
          ans = st;
          break;
        }

        for(int i=0;i<4;i++){
          int nd = (st.d + i) % 4;
          int nx = st.x + dx[nd];
          int ny = st.y + dy[nd];

          if(nx>=0 && w>nx && ny>=0 && h>ny){
            if(t[st.y][st.x] == i){
              open.add(new State(nx,ny,nd,st.cost));
            }
            else{
              open.add(new State(nx,ny,nd,st.cost+change[i]));
            }
          }
        }
      }

      System.out.println(ans.cost);
    }
  }
}

class State implements Comparable<State>{
  int x,y,d,cost;

  State(int x,int y,int d,int cost){
    this.x = x;
    this.y = y;
    this.d = d;
    this.cost = cost;
  }

  public boolean equals(Object o){
    State st = (State)o;
    return x == st.x && y == st.y && d == st.d;
  }

  public int hashCode(){
    return x + y * 100 + d * 10000;
  }

  public int compareTo(State st){
    return this.cost - st.cost;
  }
}