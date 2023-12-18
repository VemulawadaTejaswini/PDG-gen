import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] s = new int[n];
      int sum = 0;
      for(int i = 0;i < n;i++){
        s[i]=sc.nextInt();
        sum += s[i];
      }
      Arrays.sort(s);
      int k = 0;
      if(sum%10==0)
      while(k<=n-1){
      	if(s[k]%10!=0){
          sum -= s[k];
          break;
        }
        k++;
      }
      if(k==n)System.out.println(0);
      else System.out.println(sum);
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