import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long a=sc.nextLong(),b=sc.nextLong(),n=sc.nextLong(),x=0,f=0;
  	if(b-1<=n){
  		if(n<100000){
  	for(long i=b-1;i<=n;i+=b-1){
  		x=(long)(a*i/b)-a*(long)(i/b);
  		f=Math.max(f,x);
  	}
  		}else{
  			for(long i=100000/b+b-1;i<=n;i+=b-1){
  		x=(long)(a*i/b)-a*(long)(i/b);
  		f=Math.max(f,x);
  	}
  		}
  	}
  	}else{
  		f=(long)(a*n/b)-a*(long)(n/b);
  	}
  	System.out.print(f);
  }
}