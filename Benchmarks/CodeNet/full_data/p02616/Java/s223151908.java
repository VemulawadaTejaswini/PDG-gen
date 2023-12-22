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
    if(k==n) {
    for(int i=0;i<n;i++) {
    	ans=(ans*al.get(i))%mod;
    }
    System.out.println(ans);
    
    }else {
    	 if (al.get(n-1) <= 0 && k % 2 != 0) { 
             for (int i = n - 1; i >= n - k; i--) 
               ans *=al.get(i); 
        	 System.out.println(mod+ans);
         }else {
    
    
    	int i=0;int j=n-1;
    	if(k%2!=0) {
    		ans*=al.get(j)%mod;
    		j--;
    		k--;
    	}
    	k=k>>1;
    	for( i=0;i<k;i++) {
    		long lf=(al.get(i)*al.get(i+1))%mod;
    		long rf=(al.get(j)*al.get(j-1))%mod;
    		if(lf>rf) {
    			ans*=lf%mod;
    			i=i+2;
    		}else {
    			ans*=rf%mod;
    			j=j-2;
    		}
    	}
    	System.out.println(ans);
    }
    }
    
	}
	}
	


  
   