import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int D = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());
    int[] A = new int[N];
    for(int i = 0; i < N; i++){
      A[i] = Integer.parseInt(sc.next());
     }

     int temp = 0;
     for(int i = 0; i < N; i++){
       if(D % A[i] == 0){
         temp +=  D / A[i];
       }else{
         temp += D / A[i] + 1;
       }
     }

     System.out.println(X + temp);
  }
}
