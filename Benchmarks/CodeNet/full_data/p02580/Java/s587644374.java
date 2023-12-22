import java.util.*;

public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    
    int h = sc.nextInt();
    int w = sc.nextInt();
    int m = sc.nextInt();
    
    int[] harray = new int[h];
    int[] warray = new int[w];
    int[][] g = new int[h][w];
    
    for(int i = 0; i < m; i++){
      int hi = sc.nextInt()-1;
      int wi = sc.nextInt()-1;
      
      harray[hi]++;
      warray[wi]++;
      g[hi][wi]++;
    }
    
    int hindex = 0;
    int hmax = harray[0];
    for(int i=1; i<h; i++){
      if(hmax < harray[i]){
        hmax = harray[i];
        hindex = i;
      }
    }
    
    int windex = 0;
    int wmax = warray[0];
    for(int i=1; i<w; i++){
      if(wmax < warray[i]){
        wmax = warray[i];
        windex = i;
      }
    }
    
    int sum = hmax + wmax;
    if(g[hindex][windex] != 0)
      sum--;
    
    System.out.println(sum);
  }
}
