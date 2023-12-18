import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); // 5
      
      long prevPrev = 2; // 2
      long prev = 1;  // 1

      if(n == 0) { System.out.println(prevPrev); return; } 
      if(n == 1) { System.out.println(prev); return; }

      long res = 0;
      for(int i = 2; i <= n; i++) { // i = 6
        res = prevPrev + prev;  // 11
        prevPrev = prev;  // 7
        prev = res; // 11
      }

      System.out.println(res);
  }
}

