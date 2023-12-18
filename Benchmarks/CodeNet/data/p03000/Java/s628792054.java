import java.util.*;
import java.lang.Integer;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int X = sc.nextInt();
      
      int sumL = 0;
      int count = 0;
    
      while(X >= sumL){
        int L = sc.nextInt();
        sumL += L;
        count++;
        if(count == N+1){
          break;
      }
      System.out.println(count);
    }
}
