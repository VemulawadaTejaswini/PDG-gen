import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] X = new int[N*N];
    int[] Y = new int[N*N];
    for(int i0 = 0;i0<N*N;i0++){
      Y[i0] = -1;
    }
    
    //代入
    for(int i1 = 0;i1<N;i1++){
      A[i1] = sc.nextInt();
      for(int i2 = 0;i2<A[i1];i2++){
        X[N*i1+i2] = sc.nextInt();
        Y[N*i1+i2] = sc.nextInt();
      }
    }
    
    int unkind = 0;
    int[] ukList[] = new int[N];
    for(int i3 = 0;i3<N;i3++){
      ukList[i3]=0;
    }
    for(int person = 0;person<N;person++){
      for(int Ey = 0;Ey<N;Ey++){
        if(Y[N*person + Ey] == 1){
          for(int E = 0;E<N;E++){
            if(X[N*X[Ey]-N+E]==person&&Y[N*X[Ey]-N+E]==0){
              unkind++;
              ukList[person] = 1;
              E=N;
              Ey=N;
            }
          }
        }
      }
    }
    boolean[] checked = new boolean[N];
    for(int i4 = 0;i4<N;i4++){
      checked[i4] = false;
    }
    for
    System.out.println(unkind);
  }
}