import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();
    int a = X - Z;
    int b = Y + Z;
    System.out.println(a/b);
  }
}