import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();

    int min1=Math.min(a,b);
    int min2=Math.min(c,d);

    System.out.println(min1+min2);
  }
}
