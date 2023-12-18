import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
   
  		int[] a=new int[n+1];
  		int[] b=new int[n];
		for(int c=0;c<n+1;c++){
    		a[c]=sc.nextInt();
    	}
  		for(int c=0;c<n;c++){
        	b[c]=sc.nextInt();
        }
  		
  		long ans=0;
  		for(int d=0;d<n;d++){
        	if(a[d]<b[d]){
            	ans+=a[d];
              if(a[d+1]>b[d]-a[d]){
              	a[d+1]-=(b[d]-a[d]);
                ans+=(b[d]-a[d]);
              }else{
                ans+=a[d+1];
                a[d+1]=0;
              }
            }else{
            	ans+=b[d];
            }
        }
    
 	

    	System.out.println(ans);
    }
}

