import java.util.*;

public class Main { 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int N = s.length();
      int count = 0;
      for(int i = 0; i < N-3; i++){
        for(int j = i+4; j < N+1; j++){
          String x = s.substring(i, j);
          long num = Long.parseLong(x);
          if(num % 2019 == 0){
            count++;
          }
        }
      }
      System.out.println(count);
    }
}
