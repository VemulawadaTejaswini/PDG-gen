import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long a=sc.nextLong(),b=sc.nextLong(),n=sc.nextLong(),x,f;
  	x=Math.min((b-1),n);
  	f=(a*x/b)-a*(x/b);
  	System.out.print(f);
  }
}