import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long n=sc.nextLong(),f=1;
    for(long i=1;i<=n;i++){
      f*=i;
      f=f%1000000007;
    }
    System.out.println(f);
  }
}
