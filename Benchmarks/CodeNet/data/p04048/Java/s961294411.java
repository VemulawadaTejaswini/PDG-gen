import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long x=sc.nextLong();
    n=n-x;
    long ans=n+x;
    while(x!=0){
      long t=n%x;
      ans=ans+n/x*x*2;
      n=x;
      x=t;
    }
    System.out.println(ans-n);
  }
}