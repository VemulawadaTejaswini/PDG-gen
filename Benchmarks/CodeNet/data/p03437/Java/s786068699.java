import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long m=sc.nextLong();
    long cnt=2;
    long kari=0;
    if(n!=m)
       while(true){
         kari=n*cnt;
         if(kari%m!=0) {
           System.out.println(kari);
           break;
         }
       }
    else if(n==m) System.out.println("-1");
  }
}