import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //机Aの本
    int M = sc.nextInt(); //机Bの本
    int K = sc.nextInt(); //合計所要時間
    int[] A = new int[N];
    int[] B = new int[M];
    int time_sum = 0;
    int ans = 0;
    int P = 0;
    for (int i = 0; i < N; i++){
      A[i] = sc.nextInt();
    }
    for (int i = 0; i < M; i++){
      B[i] = sc.nextInt();
    }
    
    if ( N >= M )
      P = M;
    else
      P = N;
    
    for(int i = 0; i < P ; i++){
      time_sum = time_sum + A[i] + B[i];
      if (time_sum > 240 ){
      //  System.out.println(i);
       int X = time_sum - B[i];
       int Y = time_sum - A[i];
       int Z = 0;
       if( X >= Y )
        Z = Y;
       else
        Z = X;
       
        if( Z <= 240 ){
         ans = (i + 1)*2 - 1;
          break;
       	} else {
         ans = i*2;
          break;
       	}
      }
    }
    
    System.out.println(ans);
  }
}