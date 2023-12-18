import java.util.*;

class Main {
    public static final int mod = 998244353;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int a[] = new int[n];
    int dep[] = new int[n+1];

    boolean flg = true;
    double ans = 0;
    
    Arrays.fill(dep, 0);
    
    for (int i=0; i<n; i++){
      a[i] = Integer.parseInt(sc.next());
      dep[a[i]]++;
    }
    
    /*
    for (int i=0; i<n; i++){
      System.out.print(dep[i]);
      System.out.print(" ");
    }
    System.out.print("\n");
    */
    
    if(dep[0]!=1){
      System.out.println("0");
      return;
    }
    
    ans = 1;
        
    for(int i=n; i>0; i--){
      if(flg && dep[i]==0){
        continue;
      } else if (flg && dep[i]!=0){
        flg = false;
      }
      
      ans = (ans * pow(dep[i-1],dep[i]) ) % mod;
    }
    
	System.out.println((int)ans);
    
  }
  
  public static long pow(int a, int b){
    long ret = 1;
    for(int i=0; i<b; i++) {
      ret *= a%mod;
    }
	return ret%mod;
  }
}