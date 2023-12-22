import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long x=sc.nextLong(),n=100,f=0;
  	while(x>n){
  		n=(long)(n*1.01);
  		f++;
  	}
  	System.out.print(f);
  }
}