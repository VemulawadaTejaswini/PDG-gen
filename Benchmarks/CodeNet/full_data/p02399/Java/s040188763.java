import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.print(a/b + " ");
    System.out.print(a%b + " ");
    float c = (float)a/b;
    System.out.println(c);
  }
}