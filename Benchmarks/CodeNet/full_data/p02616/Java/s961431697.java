import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt(); 
    }
    System.out.println(maxProduct(a, n, k));
  }
  
  public static int maxProduct(int[] a, int n, int k){
   	Arrays.sort(a);
    int product = 1;
    if(a[n-1] == 0 && k%2 != 0){
      return 0; 
    }
    if(a[n-1] <= 0 && k%2 != 0){
      for(int i=n-1;i>=n;i--){
        product = ((product%1000000007)*(a[i]%1000000007))%1000000007; 
      }
      return product;
    }
    int i = 0;
    int j = n-1;
    if(k%2 != 0){
      product = ((product%1000000007)*(a[j]%1000000007))%1000000007;
      j--;
      k--;
    }
    k >>= 1;
    for(int t=0;t<k;t++){
      int left = a[i]*a[i+1];
      int right = a[j]*a[j-1];
      if(left > right){
       	product = ((product%1000000007)*(left%1000000007))%1000000007;
        i += 2;
      }else{
        product = ((product%1000000007)*(right%1000000007))%1000000007;
        j -= 2;
      }
    }
    return product;
  }
}
