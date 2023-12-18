import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=sc.nextInt();

    int s=n/500;
    int t=s*500;

    if ((n-t)<=a) {
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
