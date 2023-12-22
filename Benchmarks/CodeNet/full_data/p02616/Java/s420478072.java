

import java.util.*;


public class Main{
	static int MOD=(int) (1e9+7);
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

    List<Long> pos = new ArrayList<>();
    List<Long> neg = new ArrayList<>();
    int zero = 0;
    for (long i : al) {
      if (i > 0) {
        pos.add(i);
      } else if (i < 0) {
        neg.add(i);
      } else {
        zero++;
      }
    }

    Collections.sort(al);
   

    long ans=1; 
    if (pos.size() + neg.size() < k || (n == k && zero > 0)) {
        System.out.println(0);
        return;
      }
    if(k==n) {
    for(long i:al) {
    	ans=mul(ans,i);
    }
	 System.out.println(Math.floorMod(ans, MOD));
    
    }else {
    	 if (al.get(n-1) <= 0 && k % 2 != 0) { 
             for (int i = n - 1; i >= n - k; i--) 
               ans =mul(ans,al.get(i)); 
        	 System.out.println(Math.floorMod(ans, MOD));
         }else {
    
    
    	int i=0;int j=n-1;
    	if(k%2!=0) {
    		ans=mul(ans,al.get(j));
    		j--;
    		k--;
    	}
    	k=k>>1;
    	for( int itr =0;itr<k;itr++) {
    		long lf=Math.multiplyExact(al.get(i), al.get(i+1));
    		long rf=Math.multiplyExact(al.get(j), al.get(j-1));
    		if(lf>rf) {
    			ans=mul(ans,lf);
    			i=i+2;
    		}else {
    			ans=mul(ans,rf);
    			j=j-2;
    		}
    	}
    	System.out.println(ans%MOD);
    }
    }
    
	}
	  static long mul(long a, long b) {
		    return (((a + MOD) % MOD) * ((b + MOD) % MOD)) % MOD;
		  }
	}
	


  
   