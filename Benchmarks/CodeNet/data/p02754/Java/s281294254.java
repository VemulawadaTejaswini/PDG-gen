import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextInt();
    long a=sc.nextInt();//青
    long b=sc.nextInt();//赤

    long total=a+b;

    long am=n%total;

    long ans;

    if (am>a) {
      ans=n/total*a+a;
    }else{
      ans=n/total*a+am;
    }

    System.out.println(ans);
  }
}
