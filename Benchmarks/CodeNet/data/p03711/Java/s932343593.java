import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int[] a = {1,3,5,7,8,10,12};
    int[] b = {4,6,9,11};
    int[] c = {2};
    String xcheck="";
    String ycheck="";
    for (int v:a) {
      if (x == v) xcheck = "a";
      if (y == v) ycheck = "a"; 
    }
    for (int v:b) {
      if (x == v) xcheck = "b";
      if (y == v) ycheck = "b"; 
    }
    for (int v:c) {
      if (x == v) xcheck = "c";
      if (y == v) ycheck = "c"; 
    }
    if (xcheck.equals(ycheck)) {
      System.out.println("Yes");
    } else {
      System.out.println("No"); 
    }
   }
}