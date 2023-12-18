import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int lowerBound = 0;
      int upperBound = 0;
      if(s.length() % 2 == 0) { 
        upperBound = s.length() / 2;
        lowerBound = upperBound - 1;
      } else {
        upperBound = s.length()/2 + 1;
        lowerBound = s.length()/2 - 1;
      }
      int k = (s.length() + 1) / 2;
      while(upperBound < s.length() && lowerBound >= 0 && s.charAt(upperBound) == s.charAt(upperBound - 1) && s.charAt(lowerBound) == s.charAt(lowerBound + 1)) {
          upperBound++;
          lowerBound--;
          k++;
      }

      System.out.println(k);
  }
}