import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
		int[] ab=new int[n];
  		long[] sum=new long[n];
  
		for(int c=0;c<n-1;c++){
    		int a=sc.nextInt();
          	int b=sc.nextInt();
          	ab[b-1]=a-1;
    	}
  		for(int c=0;c<q;c++){
    		int p=sc.nextInt();
          	sum[p-1]+=sc.nextInt();
    	}
  		
    	for(int c=1;c<n;c++){
        	sum[c]+=sum[ab[c]];
        }
 	
		for(long ans:sum){
    	System.out.println(ans);
        }
    }
}