import java.util.Scanner;

public class Main{
  static int N,T,count;
  static int[] A;
  static int buy_id,seal_id,maxcost;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    T = sc.nextInt();
    A = new int[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
    }
    buy_id = A[0];
    maxcost = 0;
    for(int i=1;i<N;i++){
      if(A[i]<=buy_id){
        buy_id=A[i];
      }
      else{
      if(A[i]-buy_id>=maxcost){
        maxcost=A[i]-buy_id;
        count++;
      }
    }
  }
      System.out.println(count);
  }


}