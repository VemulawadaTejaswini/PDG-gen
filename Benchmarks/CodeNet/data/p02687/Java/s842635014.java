import java.util.*;
import java.io.*;
public class Auto{
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
      int n = in.nextLine();
      if(n.equals("ARC")){
      	System.out.println("ARC");
      }
      else{
      	System.out.println("ABC");
      }
    }
  }
}