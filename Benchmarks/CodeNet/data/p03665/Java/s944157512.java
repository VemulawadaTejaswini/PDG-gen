import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n=sc.nextInt(),p=sc.nextInt(),counto=0,counte=0;
    for(int i=0;i<n;i++) {
    	if(sc.nextInt()%2==0)counte++;
    	else counto++;
    }
    if(p==0) {
    	double res=1;
    	for(int i=2;i<=counto;i+=2) {
    		res+=f(i,counto);
    		//System.out.println(i+" "+f(i,counto));
    	}
    	System.out.println((long)((res)*(Math.pow(2, counte))));
    }else {
    	double res=0;
    	for(int i=1;i<=counto;i+=2) {
    		res+=f(i,counto);
    		//System.out.println(i+" "+f(i,counto));
    	}
    	System.out.println((long)(res*Math.pow(2, counte)));
    }
  }
  public static long f(long i,long n) {
	  double d=1,u=1;
	  if(i>n/2)i=n-i;
	  for(int j=1;j<=i;j++) {
		  d*=j;
	  }
	  for(int j=0;j<i;j++) {
		  u*=(n-j);
	  }
	  //System.out.println(u);
	  return (long)(u/d);
  }
}
