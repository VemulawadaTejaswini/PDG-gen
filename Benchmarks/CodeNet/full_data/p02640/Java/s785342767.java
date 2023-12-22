import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      int x = sc.nextInt();
      int y = sc.nextInt();
      boolean possible = false;
      for(int i = 0; i <= x; i++){
          int crane = i;
          int turtle = x - i;
          if(2*crane + 4*turtle == y){
              possible = true;
              break;
          }
      }
      System.out.println(possible ? "Yes" : "No");
    }
}