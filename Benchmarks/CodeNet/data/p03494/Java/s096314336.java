import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long A[] = new long [N];
    long cnt = 0;
    long min = 999;
    for(int i=0; i<N; i++){
      A[i]=sc.nextInt();
      while(A[i]%2==0){
        long temp = A[i]/2;
        cnt++;
      }
      min = Math.min(min, cnt);
      cnt = 0;
    }
    System.out.println(min);
  }
}   