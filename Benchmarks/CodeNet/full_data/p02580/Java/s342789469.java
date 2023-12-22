import java.util.*;

public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    
    int h = sc.nextInt();
    int w = sc.nextInt();
    int m = sc.nextInt();
    
    int[] g = new int[h*w];
    
    for(int i = 0; i < m; i++){
      int hi = sc.nextInt()-1;
      int wi = sc.nextInt()-1;
      
      for(int j = wi; j < g.length; j+=w){
        g[j]++;
      }
      for(int j = 0; j < w; j++){
        if(hi*h + j == (hi+1)*(wi+1)-1)
          continue;
        g[hi*h + j]++;
      }
    }
    
    int max = g[1];
    for(int i=2; i<g.length; i++){
      if(max < g[i])
        max = g[i];
    }
    
    System.out.println(max);
  }
}
