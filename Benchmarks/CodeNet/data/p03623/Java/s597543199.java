import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int ad=Math.abs(x-a);
    int bd=Math.abs(x-b);
    if (ad>bd) {
      System.out.println("B");
    }else{
      System.out.println("A");
    }
  }
}
