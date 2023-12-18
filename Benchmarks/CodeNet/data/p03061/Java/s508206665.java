import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
      	int gcd=0,gcd_max=0,x=0;
      	
		for(int i=0;i<N;i++)a[i]=sc.nextInt();
      	sc.close();
      	for(int i=0;i<N;i++){
          	if(i==N-1)x=a[i-1];
          	else x=a[i+1];
        	for(int j=0;j<N;j++){
        		if(i!=j){
                  gcd=getgcd(x,a[j]);
                  x=gcd;
                }
       	 	}
          	if(gcd_max<gcd)gcd_max=gcd;
        }
		System.out.println(gcd_max);
	}
  
  	static int getgcd(int n,int m){
     	 int r,tmp;
      	
      	 if(n>m){
           tmp=m;
           m=n;
           n=tmp;
         }
      		
      	 while((r=m%n)!=0){
           m=n;
           n=r;
         }
      	return n;
    }
}