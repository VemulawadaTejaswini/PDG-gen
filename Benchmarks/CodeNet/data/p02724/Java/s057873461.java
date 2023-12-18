import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(solve(in));
        
      }
      
      public static String solve(Scanner in) {
       Long X = in.nextLong();
       int points = 0;

        while (X >= 500) {
          X -= 500;
          points += 1000;
        }

        while (X >= 5) {
          X-= 5;
          points += 5;
        }
        return String.valueOf(points);
      }
      
    
}