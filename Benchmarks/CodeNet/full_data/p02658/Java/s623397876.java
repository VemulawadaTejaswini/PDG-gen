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
    double num = Math.pow(10,18);
    //最終値
    long sum = 1;
    for(int i=0;i<N;i++){
      sum = sum*A[0];
      if(sum>=num){ //18乗を超えたら
        sum = -1;
      }
    }
    System.out.println(sum);
  }
}