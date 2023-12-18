import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      int[][] p = new int[h][w];
      for(int i = 0;i < h;i++){
      	for(int j = i;j < a+i;j++){
        	p[i][j%w]=1;
        }
      }
      int cnt = 0;
      for(int i = 0;i < w;i++){
      	for(int j = 0;j < h;j++)if(p[j][i]==1)cnt++;
        if(cnt!=b&&h-cnt!=b){
        	System.out.println("No");
            return;
        }
        cnt = 0;
      }
      for(int i = 0;i < h;i++){
      	for(int j = 0;j < w;j++)System.out.print(p[i][j]);
        System.out.println("");
      }
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