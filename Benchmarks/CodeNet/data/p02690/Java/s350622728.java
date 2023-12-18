import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long a=0;
		long b=0;
		for(int i=-150;i<=150;i++){
			long a1 = x+(long)Math.pow(i,5);
			for(int j=-150;j<=150;j++){
				long h = (long)Math.pow(j,5);
				if(a1==h){
					a=j;
					b=i;
					break;
				}
			}
		}
		System.out.println(a+" "+b);
	}
	 static long floorRoot5(long n) 
    { 
          
        // Base cases 
        if (n == 0 || n == 1) 
        return n; 
        // Do Binary Search for  
        // floor of 5th square root 
        long low = 1, high = n, ans = 0; 
        while (low <= high) 
        { 
            // Find the middle point 
            // and its power 5 
            long mid = (low + high) / 2; 
            long mid5 = mid * mid * mid *  
                            mid * mid; 
            // If mid is the required root 
            if (mid5 == n) 
                return mid;       
            // Since we need floor,  
            // we update answer when 
            // mid5 is smaller than n,  
            // and move closer to 
            // 5'th root 
            if (mid5 < n) 
            { 
                low = mid + 1; 
                ans = mid; 
            } 
            // If mid^5 is greater 
            // than n 
            else
                high = mid - 1; 
        } 
        return ans; 
    } 
}