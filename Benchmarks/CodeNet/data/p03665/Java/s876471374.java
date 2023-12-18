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
    	System.out.println((long)((counto*(counto-1)/2+1)*(Math.pow(2, counte))));
    }else {
    	int res=0;
    	for(int i=3;i<=n;i+=2) {
    		res+=f(i,n);
    	}
    	System.out.println((long)((counto+res)*Math.pow(2, counte)));
    }
  }
  public static long f(long i,long n) {
	  long d=1,u=1;
	  //System.out.println(i);
	  for(int j=1;j<=i;j++) { 
		  d*=j;
	  }
	  //System.out.println(d);
	  for(int j=0;j<i;j++) {
		  u*=(n-j);
	  }
	  //System.out.println(u);
	  return u/d;
  }
}
