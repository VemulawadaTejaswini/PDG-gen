import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong();
		
  		long[] x=new long[n+1];
  		x[n]=k;
		for(int c=0;c<n;c++){
    		x[c]=sc.nextLong();
    	}
        Arrays.sort(x);
      if(n==1){
       long gcd=x[1]-x[0];
        System.out.println(gcd);
      }else{
      long gcd=gcd(x[1]-x[0],x[2]-x[1]);
      
 	for(int a=2;a<n;a++){
    	gcd=gcd(gcd,x[a+1]-x[a]);
    }
        System.out.println(gcd);
      }
	
    }
  
  private static long gcd(long a,long b){
   if(b==0){
   	return a;
   }
	return gcd(b, a%b);
}
}
