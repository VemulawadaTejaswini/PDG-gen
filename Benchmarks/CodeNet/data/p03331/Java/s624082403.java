import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int min=10001;
    for(int i=0; i<=N; i++){
      
      int sum=0;
      int A = i;
      while(true){
        sum += A % 10;
        A = A / 10;
        if( A == 0){
          break;
        }
      }
      
      int B = N - i;
      while(true){
        sum += B % 10;
        B = B / 10;
        if( B == 0){
          break;
        }
      }
      min = Math.min(min,sum);
    }
    
    System.out.println(min);
  }
}
    
      
      
    
  