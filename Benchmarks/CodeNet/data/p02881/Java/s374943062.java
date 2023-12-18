import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c[]=new int[n+1];
    int m=0;
    int temp;

    for (int i=1;i<=n;i++) {
      for (int j=1;j<=n;j++) {
        if (i*j==n) {
          c[m]=(i-1)+(j-1);
          m++;
        }
      }
    }

    System.out.println(c[m/2]);

  }
}
