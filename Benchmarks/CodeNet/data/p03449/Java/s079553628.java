import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      for(int i = 0;i < n;i++)b[i]=sc.nextInt();
      int[] cnt = new int[n];
      int max = 0;
      for(int i = 0;i < n;i++){
      	for(int j = 0;j <= i;j++)cnt[i]+=a[j];
        for(int j = i;j < n;j++)cnt[i]+=b[j];
        max = Math.max(max,cnt[i]);
      }
      System.out.println(max);
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