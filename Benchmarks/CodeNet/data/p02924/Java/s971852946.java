//MondSum
import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long a[]=new long[n];
    long total=0;
    for (int i=0;i<n-1;i++) {
      a[i]=i+1;
      total=total+a[i];
    }
     System.out.println(total);
  }
}
