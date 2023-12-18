import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int x2=x-a;
    int s=x2/b;

    System.out.println(x2-s*b);
  }
}
