import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
  		long[] a=new long[n];
   for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
    	}
  		long[] b=new long[n];
        b[0]=a[0];
  		for(int c=0;c<n-1;c++){
         b[c+1]=lcm(b[c],a[c+1]);
        }
  		long k=b[n-1];
  		long ans=0;
  		for(int c=0;c<n;c++){
        	ans+=k/a[c];
        }
  		ans=ans%(1000000007);
  
    	System.out.println(ans);
    }
private static long lcm(long a, long b){
  return a*b/gcd(a,b);
}
  
private static long gcd(long a,long b){
   if(b==0){
   	return a;
   }
	return gcd(b, a%b);
}

}