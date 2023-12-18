import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int ac=Math.abs(a-c);
    int abc=Math.abs(c-b-a);

    if (ac<=d||abc<=d) {
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
