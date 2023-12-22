import java.util.*;

class Main{
  public static final int N = 4;
  public static final int N2 = 16;
  public static final int LIMIT = 100;

  static final int dx[] = {0, -1, 0, 1};
  static final int dy[] = {1, 0 , -1, 0};
  static final char dir[] = {'r', 'u', 'l', 'd'};
  static int MDT[][] = new int[N2][N2];

  static Puzzle state;
  static int limit;
  static int path[] = new int[LIMIT];


  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    for(int i =0; i<N2; i++){
      for(int j = 0; j<N2; j++){
        MDT[i][j] = Math.abs(i/N - j/N) + Math.abs(i%N - j%N);
      }
    }
    Puzzle in = new Puzzle();

    for(int i = 0; i < N2; i++){
      in.f[i] = sc.nextInt();
      if(in.f[i] == 0){
        in.f[i] = N2;
        in.space = i;
      }
    }
    String ans = iterative_deepening(in);
    // System.out.println(ans);
    System.out.println(ans.length());
  }

  static int getAllMD(Puzzle pz){
    int sum = 0;
    for(int i = 0; i<N2; i++){
      if(pz.f[i] == N2)continue;
      sum += MDT[i][pz.f[i] - 1];
    }
    return sum;
  }

  static boolean isSolved(){
    for(int i = 0; i < N2; i++){
      if(state.f[i] != i+1)return false;
    }
    return true;
  }

  static boolean dfs(int depth, int prev){
    if(state.MD == 0) return true;

    if(depth + state.MD > limit)return false;

    int sx = state.space / N;
    int sy = state.space %N;
    Puzzle tmp;

    for(int r = 0; r<4; r++){
      int tx = sx + dx[r];
      int ty = sy + dy[r];
      if(tx < 0 || ty <0 || tx>= N || ty >= N)continue;
      if(Math.max(prev, r) - Math.min(prev,r) == 2)continue;
      tmp = new Puzzle();
      tmp.MD = state.MD;
      tmp.space = state.space;
      tmp.f = Arrays.copyOf(state.f, N2);
      // tmp = state;

      state.MD -= MDT[tx * N + ty][state.f[tx * N +ty] - 1];
      state.MD +=MDT[sx * N + sy][state.f[tx* N + ty] -1];
      int tmp2;
      tmp2 = state.f[tx * N + ty];
      state.f[tx * N + ty] = state.f[sx * N +sy];
      state.f[sx * N + sy] = tmp2;

      state.space = tx * N +ty;

      if( dfs(depth +1, r)){
        path[depth] = r;
        return true;
      }
      state.MD = tmp.MD;
      state.space = tmp.space;
      state.f = Arrays.copyOf(tmp.f, N2);
      // state = tmp;
    }
    return false;
  }

  static String iterative_deepening(Puzzle in){
    in.MD = getAllMD(in);

    for(limit = in.MD; limit <= LIMIT; limit++){
      state = in;
      if(dfs(0, -100)){
        String ans = "";
        for(int i = 0; i<limit; i++)ans += dir[path[i]];
        return ans;
      }
    }
    return "unsolvable";
  }
}

class Puzzle{
  int f[];
  int space,MD;
  Puzzle(){
    space = 0;
    MD = 0;
    f = new int[16];
  }
}
