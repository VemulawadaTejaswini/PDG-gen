import java .util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long s=sc.nextLong();
    long p,q,r;
    p=s/500;
    q=(s%500)/5;
    r=p*1000+q*5;
    System.out.print(r);
  }
}