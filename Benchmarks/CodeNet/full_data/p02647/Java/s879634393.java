import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int N,K;
    int i, j;
    int tmp1,tmp2, cnt= 0;
    N = scn.nextInt();
    K = scn.nextInt();
    int A[] = new int[N];
    int B[] = new int[N];
    for(i = 0; i < N; i++){
      A[i] = scn.nextInt();
    }
    while(cnt < K){
    for(i = 0; i < N; i++){
      for(j = 0; j < N; j++){
        if(i != j){
        tmp1 = (int)(i - A[j] - 0.5);
        tmp2 = (int)(i + A[j] + 0.5);
        if(tmp1 < i && tmp2 > i){
          B[i]++;
        }
        }
      }
    }
    cnt++;
    }
    for(i = 0; i < N; i++){
      System.out.print(B[i]);
    }
  }
}