import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    
    for(int i = 0; i < K; i++){
      if(i%2==0){
        A /= 2;
        B += A;
      }else{
        B /= 2;
        A += B;
      }
    }
    
    System.out.println(A+" "+B);
  }
}