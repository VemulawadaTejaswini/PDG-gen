import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long a,b,c,d;
    a=sc.nextLong();
    b=sc.nextLong();
    c=sc.nextLong();
    d=c-a-b;
    
	if(d>0&&d*d>4*a*b){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}