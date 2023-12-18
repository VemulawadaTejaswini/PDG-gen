import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //X未満の数が何個あるか数える方針でにぶたん
    //数える時もにぶたん
    long N = sc.nextLong();
    long K = sc.nextLong();
    long A[] = new long[N];
    for(int i =0;i<N;i++){
      A[i]=sc.nextLong();
    }
    //昇順に整列
    Arrays.sort(A);
    
  }
  
  //Xに対してX未満の数が何個あるか数えるメソッド
  public static long cnt(long A[],long X){
    return 0;
  }

  
}