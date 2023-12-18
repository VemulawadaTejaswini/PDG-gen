import java.util.*;

class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int C = sc.nextInt();
    int array[] = new int[M];
    for (int i=0;i<M;i++){
      array[i] = sc.nextInt();
    }
    long ans = 0;
    
    for (int i=0;i<N;i++){
      int checker = C;
      for (int j=0;j<M;j++){
       checker += array[j]*(sc.nextInt());
      }
      if (checker>0){
        ans += 1;
      }
    }
    System.out.println(ans);
  }
}