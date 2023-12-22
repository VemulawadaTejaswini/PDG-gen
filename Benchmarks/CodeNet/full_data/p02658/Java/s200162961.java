import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //取得
    int N = sc.nextInt();
    long[] A = new long[N]; 
    for(int i=0;i<N;i++){
      A[i] = sc.nextLong();
    }
    //最大値
    double max = Math.pow(10,18);
    //最終値
    long sum = 1;
    for(int i=0;i<N;i++){
      if(A[i]==0){//0をかけたらsumは0で終了
        sum = 0;
        break;
      }else if(sum*A[i]>max){//次で18乗を超えるなら-1
        sum = -1;
        break;
      }else{
        sum = sum*A[i];
      }
    }
    System.out.println(sum);
  }
}