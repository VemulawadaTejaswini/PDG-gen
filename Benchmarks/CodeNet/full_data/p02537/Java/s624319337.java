import java.util.*;

 public class Main 
{ 
  
// Function to find 
// the longest Special Sequence 
static int longest_subseq(int n, int k,int a[]) 
{ 
  
    // Creating a list with 
    // all 0's of size 
    // equal to the length of String 
    int []dp = new int[n]; 
  
    // Supporting list with 
    // all 0's of size 26 since 
    // the given String consists 
    // of only lower case alphabets 
   int []max_length = new int[n+1]; 
  
    for (int i = 0; i < n; i++)  
    { 
  
        // Converting the ascii value to 
        // list indices 
        int curr = a[i]; 
          
        // Determining the lower bound 
        int lower = Math.max(0, curr - k); 
          
        // Determining the upper bound 
        int upper = Math.min(n, curr + k); 
          
        // Filling the dp array with values 
        for (int j = lower; j < upper + 1; j++) 
        { 
            dp[i] = Math.max(dp[i], max_length[j] + 1); 
        } 
          
        // Filling the max_length array with max 
        // length of subsequence till now 
        max_length[curr] = Math.max(dp[i], max_length[curr]); 
    } 
  
    int ans = 0; 
  
    for(int i:dp) ans = Math.max(i, ans); 
  
    // return the max length of subsequence 
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
   Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
    int k = sc.nextInt(); 
  int a[]=new int[n];
  for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
  }
    
    System.out.print(longest_subseq(n, k, a)); 
} 
} 
  
// This code is contributed by 29AjayKumar 