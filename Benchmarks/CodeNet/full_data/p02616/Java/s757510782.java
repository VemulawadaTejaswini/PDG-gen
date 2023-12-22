import java.io.*; 
import java.util.*; 
class Main { 
  static long maxProductSubarrayOfSizeK(long A[], int n, int k, long mod) 
  { 
    Arrays.sort(A); 
    long product = 1; 
    if (A[n - 1] == 0 && k % 2 != 0) 
      return 0;  
    if (A[n - 1] <= 0 && k % 2 != 0) { 
      for (int i = n - 1; i >= n - k; i--) 
        product = (product%mod*A[i]%mod)%mod; 
      //if(product<0)
      return (product+mod)%mod;
      //else return product%mod; 
    } 
    int i = 0; 
    int j = n - 1;
    if (k % 2 != 0) { 
      product = (product%mod*A[j]%mod)%mod; 
      j--; 
      k--; 
    } 

    k >>= 1;  
    for (int itr = 0; itr < k; itr++) { 
      long left_product = (A[i]%mod * A[i + 1]%mod)%mod; 
      long right_product = (A[j]%mod * A[j - 1]%mod)%mod; 
      if (left_product > right_product) { 
        product = (product%mod* left_product%mod)%mod; 
        i += 2; 
      } 
      else { 
        product =(product%mod*right_product%mod)%mod; 
        j -= 2; 
      } 
    } 
    //if(product<0)
    return (product+mod)%mod;
    //else return product%mod;
  } 

  public static void main(String[] args) 
  { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] arr = new long[n];
    int k = sc.nextInt();
    for(int i=0;i<n;i++){
      arr[i]=sc.nextLong();
    }
    long mod = 1000000007;
    System.out.println(maxProductSubarrayOfSizeK(arr, n, k,mod)); 
  } 
} 