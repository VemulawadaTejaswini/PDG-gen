import java.util.*; 
  
class GFG  
{ 
      
    // Function to return the count of  
    // trailing 0s in the given function  
    static int findTrailingZeros(int n)  
    {  
        // If n is odd  
        if ((n & 1) == 1)  
            return 0;  
      
        // If n is even  
        else 
        {  
            int ans = 0;  
      
            // Find the trailing zeros  
            // in n/2 factorial  
            n /= 2;  
            while (n != 0) 
            {  
                ans += n / 5;  
                n /= 5;  
            }  
      
            // Return the required answer  
            return ans;  
        }  
 }  
  
    public static void main (String[] args) 
    {  
        int n = 12;  
      
        System.out.println(findTrailingZeros(n));  
    }  
} 
  