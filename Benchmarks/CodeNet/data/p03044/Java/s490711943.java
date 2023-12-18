import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] u;
    u = new int[N-1];
    int[] v;
    v = new int[N-1];
    int[] w;
    w = new int[N-1];

    for ( int i = 0 ; i < N-1; i++ ){
      u[i] = sc.nextInt();
      v[i] = sc.nextInt();
      w[i] = sc.nextInt();
    }

    int[] ODDw; //w[i] が奇数となるiからなる数列
    ODDw = new int[N-2];
    int k = 0;
    for (int i = 0 ; i < N-1 ; i++ ){
      if ( w[i] % 2 == 1 ){
        ODDw[k]=i;
        k++;
      }
    }

    int[] out;
    out = new int[N-1];
    for ( int i = 0 ; i < N ; i++ ){
      out[i] =0;
    }//最初は全部白

    if(k==0){
      for (int i = 0 ; i < N ; i++ ){
      System.out.print(0);
      }
    }else{
      for (int i =0 ; i < k; i++ ){
        if( u[ODDw[i]] + v[ODDw[i]] == 0 ){
          out[u[ODDw[i]]]=1;
        }
      }
      for(int i = 0 ; i < N ; i++){
        System.out.println(out[i]);
      }
    }
  }
}