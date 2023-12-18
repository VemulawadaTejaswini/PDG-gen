import java.util.*;
public class Kk{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    long N = sc.nextLong();
    long min=N;
    for(int i=1;i*i<=N;i++){
      if(N%i==0){
      long x=i-1;
      long y=N/i-1;
      min=Math.min(min,x+y);
      // System.out.println(x,y);
      // System.out.println(min);
     }
    }
    System.out.println(min);
  }
}