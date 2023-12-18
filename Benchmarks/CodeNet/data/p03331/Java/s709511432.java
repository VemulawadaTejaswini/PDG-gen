import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int min=100001;
    for(int i=1; i<N; i++){
      
      int sum=0;
      int A = i;
      while(A>0){
        sum += A % 10;
        A = A / 10;
      }
      
      int B = N - i;
      while(B>0){
        sum += B % 10;
        B = B / 10;
      }
      min = Math.min(min,sum);
    }
    
    System.out.println(min);
  }
}
    
      
      
    
  