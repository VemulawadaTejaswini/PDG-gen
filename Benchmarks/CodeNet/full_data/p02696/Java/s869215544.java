import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long a=sc.nextLong(),b=sc.nextLong(),n=sc.nextLong(),x=0,f=0;
  	for(long i=(long)(1+(b/a));i<=n;i++){
  		x=(long)(a*i/b)-a*(long)(i/b);
  		if(x>=f){
  			f=x;
  		}else{
  			break;
  		}
  	}
  	System.out.print(f);
  }
}