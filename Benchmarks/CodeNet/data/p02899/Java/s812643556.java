import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m;
    int a[]=new int[n+1];

    for (int i=1;i<=n;i++) {
      m=sc.nextInt();
      a[m]=i;
    }

    for (int i=1;i<=n;i++) {
      System.out.println(a[i]);
    }


  }
}
