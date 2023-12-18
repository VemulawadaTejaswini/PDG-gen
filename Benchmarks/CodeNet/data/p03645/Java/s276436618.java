import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] a = new int[m];
      int[] b = new int[m];
      Map<Integer,Integer> map = new HashMap<>();
      for(int i = 0;i < m;i++){
      	a[i]=sc.nextInt();
        b[i]=sc.nextInt();
        if(a[i]==1||b[i]==n)map.put(a[i],b[i]);
      }
      for(int i = 1;i <= n-1;i++){
      	if(map.containsKey(i)&&map.containsValue(i)){
        	System.out.println("POSSIBLE");
          return;
        }
      }
      System.out.println("IMPOSSIBLE");
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