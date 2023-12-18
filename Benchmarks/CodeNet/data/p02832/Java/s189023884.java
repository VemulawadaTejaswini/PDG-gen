import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for (int i=0;i<n;++i) {
      a[i]=sc.nextInt();
    }

    int count=1,ans=0;
    for (int i=0;i<n;++i) {
      if (a[i]==count) {
        ++count;
      }
      else{
        ans++;
      }
    }
    if (count!=1) {
      System.out.println(ans);
    }
    else if (ans==0) {
      System.out.println("0");
    }
    else{
      System.out.println("-1");
    }
  }
}
