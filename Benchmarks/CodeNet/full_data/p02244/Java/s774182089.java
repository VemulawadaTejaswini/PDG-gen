import java.util.Scanner;

class Main{
  static final int N = 8;
  static boolean[] row = new boolean[N];
  static boolean[] col = new boolean[N];
  static boolean[] dpos = new boolean[2*N -1];
  static boolean[] dneg = new boolean[2*N -1];
  static boolean[][] X = new boolean[N][N];


  static void print_Board(){
    for(int i = 0; i < N; i++){
      for(int j = 0; j < N; j++){
        if(X[i][j]){
          if(j == N-1)
            System.out.println("Q");
          else
            System.out.print("Q");
          }
        else{
          if(j == N-1)
            System.out.println(".");
          else
            System.out.print(".");
        }
      }
    }
  }

  static void putQueen(int i){
    if(i == N){
      print_Board();
      return;
    }
    else{
      for(int j = 0; j < N; j++){
        if(X[i][j])
          putQueen(i+1);
        else if(col[j] || dpos[i+j] || dneg[i-j+N-1]){
          continue;
        }
        else{
          row[i] = true;
          col[j] = true;
          dpos[i+j] = true;
          dneg[i-j+N-1] = true;
          X[i][j] = true;
          putQueen(i+1);
          row[i] = false;
          col[j] = false;
          dpos[i+j] = false;
          dneg[i-j+N-1] = false;
          X[i][j] = false;
        }
      }
      return;
    }
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int k = stdIn.nextInt();

    for(int i = 0; i < N; i++){
      row[i] = false;
      col[i] = false;
    }
    for(int i = 0; i < 2*N-1; i++){
      dpos[i] = false;
      dneg[i] = false;
    }
    for(int i = 0; i < N; i++)
      for(int j = 0; j < N; j++)
        X[i][j] = false;

    for(int i = 0; i < k; i++){
      int x = stdIn.nextInt();
      int y = stdIn.nextInt();
      X[x][y] = true;
      row[x] = true;
      col[y] = true;
      dpos[x+y] = true;
      dneg[x-y+N-1] = true;
    }

    putQueen(0);

  }
}