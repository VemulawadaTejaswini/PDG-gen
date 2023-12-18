import java.util.*;
public class Main{
    static Scanner sc = new Scanner(System.in);
      static int n = sc.nextInt();
      static int[] h = new int[n];
    public static void main(String[] args){
      for(int i = 0;i < n;i++)h[i]=sc.nextInt();
      System.out.println(div(1,n));
    }
    public static int div(int x,int y){
      if(y==x) return h[x-1];
      if(y < x) return 0;
      int min = 10000000;
      for(int i = x;i <= y;i++){
      	min = Math.min(min,h[i-1]);
      }
      for(int i = x;i <= y;i++){
      	h[i-1]-=min;
      }
      for(int i = x;i <= y;i++){
      	if(h[i-1]==0)return div(x,i-1)+div(i+1,y)+min;
      }
      return 0;
    }
}