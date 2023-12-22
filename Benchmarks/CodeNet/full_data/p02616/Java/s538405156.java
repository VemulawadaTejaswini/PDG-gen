
import java.util.*;


public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
  int k=sc.nextInt();
   ArrayList<Long> al=new ArrayList<>();
    for(int i=0;i<n;i++){
		al.add(sc.nextLong());
      
    }
    ArrayList<Long> b=new ArrayList<>(al);
int mod=(int) (1e9+7);


    Collections.sort(al);
   

    long ans=1; long ncount=0;
    if (al.get(n-1) == 0 && (k & 1)!=0) { 
    	System.out.println(0);
    }
        
    if(k==n) {
    for(int i=0;i<n;i++) {
    	ans=((ans%mod)*(al.get(i)%mod))%mod;
    }
    System.out.println(ans);
    
    }else {
    	 if (al.get(n-1) <= 0 && k % 2 != 0) { 
             for (int i = n - 1; i >= n - k; i--) 
               ans =((ans%mod)*(al.get(i)%mod))%mod; 
        	 System.out.println(mod+ans);
         }else {
    
    
    	int i=0;int j=n-1;
    	if(k%2!=0) {
    		ans=((ans%mod)*(al.get(j)%mod))%mod;
    		j--;
    		k--;
    	}
    	k=k>>1;
    	for( int itr =0;itr<k;itr++) {
    		long lf=((al.get(i)%mod)*(al.get(i+1)%mod))%mod;
    		long rf=((al.get(j)%mod)*(al.get(j-1)%mod))%mod;
    		if(lf>rf) {
    			ans=((ans%mod)*(lf%mod))%mod;
    			i=i+2;
    		}else {
    			ans=((ans%mod)*(rf%mod))%mod;
    			j=j-2;
    		}
    	}
    	System.out.println(ans%mod);
    }
    }
    
	}
	}
	


  
   