import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    int k=sc.nextInt();
    long cnt=0;
    for(int i=1;i<=n;i++)
      for(int j=1;j<=n;j++)
        if(i%j>=k) cnt++;
    System.out.println(cnt);
  }
}
