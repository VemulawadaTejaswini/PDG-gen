import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int count = 0;
    int total = 0;
    
    for(int i = 0; i <= N; i++){
      count += i % 10;
      N = N / 10;
      if (N == 0){
        if(A<=count && count<=B){
          total += i;
        }
      }
    }
    System.out.println(total);
  }
}

       
      