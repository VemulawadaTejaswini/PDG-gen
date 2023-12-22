import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long a=sc.nextLong(),b=sc.nextLong(),n=sc.nextLong(),x=0,f=0;
  	x=Math.min(b,n);
  	f=(long)(a*x/b)-a*(long)(x/b);
  	System.out.print(f);
  }
}