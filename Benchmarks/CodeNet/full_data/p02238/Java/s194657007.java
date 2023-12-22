import java.util.*;
public class Main {
  Scanner sc = new Scanner(System.in);
  int n, u, k, v;
  int[][] A;
  int[] d;
  int[] f;
  int[] c;
  int time;

  public static void main(String[] args){ 
    Main main = new Main();
    main.in();
    main.dfs();
    main.out();
  }
public void dfs(){
  for(int i = 0;i < u;i++){
    c[i] = 0;
  }
  time = 0;
    for(int i = 0;i < n;i++){
      if(c[i] == 0){
        visit(i);
      }
    }
}
public void visit(int i){
  c[i] = -1;
  d[i] = ++time;
  for(int j = 0;j < n;j++){
    if(c[j] == 0 && A[i][j] == 1){
      visit(j);
    }  
  }
  c[i] = 1;
  f[i] = ++time;
}
public void in(){
  n = sc.nextInt();
  A = new int[n][n];
  d = new int[n];
  f = new int[n];
  c = new int[n];
  for(int i = 0;i < n;i++){
    u = sc.nextInt();
    k = sc.nextInt();
    for(int j = 0;j < k;j++){
      v = sc.nextInt();
      A[u - 1][v - 1] = 1;
    }
    }
}
public void out(){
  for(int i = 0;i < n;i++){
    System.out.println(i + 1 +" "+d[i]+" "+f[i]);
  }
 }
}

