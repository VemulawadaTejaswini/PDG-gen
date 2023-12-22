import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
  		long[] a=new long[n];
  		long ans=1;
		for(int c=0;c<n;c++){
    		a[c]=sc.nextLong();
          	if(a[c]==0){
            	ans=0;
            }
    	}
  	if(ans!=0){
		for(int c=0;c<n;c++){
          if(a[c]<=(long)Math.pow(10,18)/ans){
            ans*=a[c];
          }else{
          	ans=-1;
            break;
          }
    	}
    }
    	System.out.println(ans);
    }
}
