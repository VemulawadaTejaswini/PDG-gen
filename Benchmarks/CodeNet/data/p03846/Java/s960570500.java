import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      Arrays.sort(a);
      if(a[0]==0){
        if(n%2==0){
        	System.out.println(0);
            return;
        }else{
          for(int i = 1;i < n-1 ;i+=2){
          	if(a[i]!=a[i+1]||a[i]!=i+1){
          		System.out.println(0);
            	return;
          	}
      	  }
        }
      }else if(a[0]==1){
      	if(n%2==1){
        	System.out.println(0);
            return;
        }else{
          for(int i = 0;i < n-1;i+=2){
          	if(a[i]!=a[i+1]||a[i]!=i+1){
            	System.out.println(0);
                return;
            }
          }
        }
      }else{
      	System.out.println(0);
        return;
      }
      long x = (long)n/2;
      long q = 1000000007;
      long p = pow(2,x,q);
      System.out.println(p%q);
    }
  public static long pow(long a,long x,long mod){
        if(x == 0) return 1;
		if(x == 1) return a % mod;
		else if(x % 2 == 0) return pow((a*a)% mod,x/2,mod) % mod;
		else return (a*pow((a*a)%mod,x/2,mod))%mod;
  }
    public static int lcm(int x, int y){
      return x*y/gcd(x,y);
    }
    public static int gcd(int x, int y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
}