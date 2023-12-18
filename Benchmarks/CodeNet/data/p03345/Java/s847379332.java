import java.util.Scanner;
public class Main{
 public static void main(String args[]){
  boolean flag=false;
  Scanner scan=new Scanner(System.in);
  String s;

  s=scan.next();
  long a=Long.parseLong(s);
  s=scan.next();
  long b=Long.parseLong(s);
  s=scan.next();
  long c=Long.parseLong(s);
  s=scan.next();
  long k=Long.parseLong(s);
 
  long cnt=0;
  long nh=a,nm=b,nl=c,bh,bm,bl,sum=a+b+c;
  //(now,before)(high,middle,low) ans=nh-nm;
 long ans=nh-nm;
 if(k%2==1)ans=nm-nh;
 if(Math.abs(ans)>1e8)System.out.println("Unfair");
 else System.out.println(ans);
 }
}
