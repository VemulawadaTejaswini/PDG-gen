import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[][] b = new int[a][2];
    int d = 0;
    double ans = 0;
    int f = 0;
    double g = 0;  
    int h = 1;
    for(int i = 0;i < a;i++){
      b[i][0] = sc.nextInt();
      b[i][1] = sc.nextInt();      
    }
    for(int j = 1;j < a;j++){
      d += j;
    }
    System.out.println(d);    
    for(int w = 1; w <= a;w++){
      h *= w;
    }
    System.out.println(h);
    double[] c = new double[d];
    for(int x = 0;x < a-1;x++){
      for(int y = x + 1;y < a;y++){
       double e = Math.pow(b[x][0] - b[y][0] , 2) + Math.pow(b[x][1] - b[y][1] , 2);
       c[f] = Math.sqrt(e);
        f++;
      }
    }
    System.out.println(Arrays.toString(c));
    for(int z = 0;z < d;z++){
      g += c[z]; 
    }
    int k = (h * (a - 1)) / d ;
    System.out.println(g);
    ans = (g * k)/ h;
    System.out.println(ans);
  }
}