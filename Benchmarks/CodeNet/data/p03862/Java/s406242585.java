import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner in = new Scanner(System.in);		
      int n = in.nextInt();
      long x = in.nextLong();
      long a[] = new long[n];
      long ac[] = new long[n];
      for( int i =0;i<n;i++){
      	a[i] = in.nextLong();
        ac[i] =a[i];
      }
      for(int i = 0; i<n-1;i++){
      	if(a[i]+a[i+1]>x){
          	long dif = a[i]+a[i+1]-x;
          	if(dif<a[i+1]){
            	a[i+1]-=dif;
            }
          	else{
            	dif-=a[i+1];
              	a[i+1] = 0;
              	a[i]-=dif;
            }
        }
      }
      long sum=0;
      for(int i = 0;i<n;i++){
      	sum+=ac[i]-a[i];
      }
      System.out.println(sum);
    }
}
