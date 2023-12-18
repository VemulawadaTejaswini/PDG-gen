
import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      char[][] c = new char[h][w];
      int INF = 1000000;
      for(int i=0;i<h;i++)c[i]=sc.next().toCharArray();
      int[][] path = new int[h*w+1][h*w+1];
      for(int i=0;i<=h*w;i++)Arrays.fill(path[i],INF);
      for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          if(c[i][j]=='#'){
            if(i<h-1){
              path[i*w+j][(i+1)*w+j]=INF;
              path[(i+1)*w+j][i*w+j]=INF;
            }
            if(j<w-1){
              path[i*w+j][i*w+j+1]=INF;
              path[i*w+j+1][i*w+j]=INF;
            }
            if(i>0){
              path[i*w+j][(i-1)*w+j]=INF;
              path[(i-1)*w+j][i*w+j]=INF;
            }
            if(j>0){
              path[i*w+j][i*w+j-1]=INF;
              path[i*w+j-1][i*w+j]=INF;
            }
          }else{
            if(i<h-1&&c[i+1][j]=='.'){
              path[i*w+j][(i+1)*w+j]=1;
              path[(i+1)*w+j][i*w+j]=1;
            }
            if(j<w-1&&c[i][j+1]=='.'){
              path[i*w+j][i*w+j+1]=1;
              path[i*w+j+1][i*w+j]=1;
            }
            if(i>0&&c[i-1][j]=='.'){
              path[i*w+j][(i-1)*w+j]=1;
              path[(i-1)*w+j][i*w+j]=1;
            }
            if(j>0&&c[i][j-1]=='.'){
              path[i*w+j][i*w+j-1]=1;
              path[i*w+j-1][i*w+j]=1;
            }
          }
        }
      }
      int max = 0;
      for(int i=0;i<h*w;i++)path[i][i]=INF;
      for(int i=0;i<h*w;i++)
        for(int j=0;j<h*w;j++){
          for(int k=0;k<h*w;k++)path[i][j]=Math.min(path[i][j],path[i][k]+path[k][j]);
        }
      List<Integer> list = new ArrayList<>();
      for(int i=0;i<h*w;i++)
        for(int j=0;j<h*w;j++)if(path[i][j]<=1000&&i!=j)list.add(path[i][j]);
      Collections.sort(list);
      System.out.println(list.get(list.size()-1));
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