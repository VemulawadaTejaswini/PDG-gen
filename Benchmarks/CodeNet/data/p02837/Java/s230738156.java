import java.util.*;
public class Main{   
    static int n;
    static int[][] x;
    static int[][] y;
    static int[] a;
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      x = new int[n+1][n+1];
      y = new int[n+1][n+1];
      a = new int[n+1];
      for(int i=1;i<=n;i++){
        a[i]= sc.nextInt();
        for(int j=1;j<=a[i];j++){
          x[i][j]=sc.nextInt();
          y[i][j]=sc.nextInt();
        }
      }
      int ans = 0;
      for(int i=0;i<Math.pow(2,n);i++){
        String bit = Integer.toBinaryString(i);
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<n-bit.length();j++)sb.append("0");
        sb.append(bit);
        boolean[] flag = new boolean[n+1];
        int cnt = 0;
        String s = sb.toString();
        for(int j=0;j<s.length();j++){
          if(s.charAt(s.length()-j-1)=='1'){
            flag[j+1]=true;
            cnt++;
          }
        }
        if(!muzyun(flag))ans = Math.max(ans,cnt);
      }
      System.out.println(ans);
    }
    public static boolean muzyun(boolean[] arr){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=a[i];j++){
          if(y[i][j]==1&&arr[x[i][j]]==false&&arr[i]==true)return true;
          else if(y[i][j]==0&&arr[x[i][j]]==true&&arr[i]==true)return true;
        }
      }
      return false;
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
class Pair{
    int a,b;

    Pair(int a, int b){
      this.a = a;
      this.b = b;
    }
}