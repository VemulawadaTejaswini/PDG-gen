import java.util.*;

public class Main{
  public static double e(int n){
    return (double)(n+1)/(double)2;
  }
	public static int sum(int n,int m){
		int j=0;
		for(int i=0;i<m;i++){
			j+=n-i;
		}
		return j;
	}
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),k=sc.nextInt(),f=0;
    int[] p=new int[n];
  	double[] s=new double[n];
  	
    double max=0,fmax=0;
    for(int i=0;i<n;i++){
      p[i]=sc.nextInt();
    	if(i==0){
    		s[i]=e(p[i]);
    	}else{
    		s[i]=s[i-1]+e(p[i]);
    	}
    }
  	for(int i=0;i<=n-k;i++){
  		if(i==0){
  			max=s[k];
  		}else{
  			max=Math.max(max,s[i-1+k]-s[i-1]);
  		}
  	}
  	
  	System.out.println(max);
  }
}
