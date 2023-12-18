import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

  		long[] a=new long[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
    	}
  
    long lcm=a[0];
  for(int d=1;d<n;d++){
   lcm=lcm(lcm,a[d]);
  }
   lcm--;
    long ans=0;
 	for(int e=0;e<n;e++){
    ans+=lcm%a[e];
    }

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