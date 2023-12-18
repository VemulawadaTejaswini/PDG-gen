import java.util.*;

public class Main{
	public static long fu(int n){
		if(n>0){
			return (long)(n*(n-1)/2);
		}else{return (long)0;}
	}
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt();
  	long f=0;
  	int[] a=new int[n],b=new int[n];
  	long[] c=new long[n];
  	for(int i=0;i<n;i++){
  		b[i]=0;
  		c[i]=0;
  	}
  	for(int i=0;i<n;i++){
  		a[i]=sc.nextInt();
  		b[a[i]-1]++;
  		c[a[i]-1]=fu(b[a[i]-1]);
  	}
  	for(int i=0;i<n;i++){
  		f+=c[i];
  	}
  	for(int i=0;i<n;i++){
  		long e=f;
  		if(b[a[i]-1]>1){
  			e=e-c[a[i]-1]+fu(b[a[i]-1]-1);
  		}
  		System.out.println(e);
  	}
  }
}