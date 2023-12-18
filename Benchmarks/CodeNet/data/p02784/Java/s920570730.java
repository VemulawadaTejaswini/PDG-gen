import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int n=sc.nextInt();
    int a[]=new int[n];
    for (int i=0;i<n;i++) {
      a[i]=sc.nextInt();
    }

    Arrays.sort(a);

    int count=0;

    for (int i=0;i<n-1;i++) {
      if (h-(a[i]+a[i+1])<=0) {
        count++;
      }
    }

    if (count>0) {
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
