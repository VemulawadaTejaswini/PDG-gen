import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int X = sc.nextInt();
    int Y = sc.nextInt();
    
    System.out.println((Y >= 2*X && Y <= 4*X && Y%2==0)?"Yes":"No");
      
  }
}