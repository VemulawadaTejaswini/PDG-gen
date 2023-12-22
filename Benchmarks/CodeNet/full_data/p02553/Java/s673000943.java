import java.util.Scanner;
import java.util.*;

public class solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int x = Math.max(a,b);
    int y = Math.max(c,d);
    System.out.println(x*y);
  }
}