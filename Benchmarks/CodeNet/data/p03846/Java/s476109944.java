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
          for(int i = 1;i < n;i+=2){
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
          for(int i = 0;i < n;i+=2){
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
      int x = n/2;
      long p = (long)Math.pow(2,x)%1000000007;
      System.out.println(p);
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
