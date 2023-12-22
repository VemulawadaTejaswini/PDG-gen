import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] a = new long[n];
    long ans = 1;
    long MOD = 1000000007;
    boolean allminus = true;
    for(int i=0;i<n;i++){
      a[i] = sc.nextLong();
      if( a[i] > -1 ){
        allminus = false;
      }
    }
    Arrays.sort(a);
    
    int head = 0;
    int tail = n-1;
    int count = 0;
    while(true){
      if( count + 2 > k ){
        break;
      }
      if( a[tail] * a[tail-1] >= a[head] * a[head+1] ){
        ans = ( ans * a[tail] % MOD ) * a[tail-1] % MOD;
        tail -= 2;
      }else{
        ans = ( ans * a[head] % MOD ) * a[head+1] % MOD;
        head += 2;
      }
      count += 2;      
    }
    if( count + 1 == k ){
      ans = ans * a[tail] % MOD;
    }
    
    if( allminus && k % 2 == 1 ){
      ans = 1;
      for(int i=1;i<k+1;i++){
        ans =  ans * a[n-i] % MOD;
      }
    }
    if( ans < 0 ){
      ans += MOD;
    }
    System.out.println(ans);  
  }
}