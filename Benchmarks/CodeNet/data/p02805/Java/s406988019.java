import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int maxDis = 0;
    int[][] plot = new int[n][2];
    int[] maxPlot = {0, 0};
    
    for(int i = 0; i < n; i++){
      plot[i][0] = sc.nextInt();
      plot[i][1] = sc.nextInt();
      
      int dis = plot[i][0] * plot[i][0] + plot[i][1] * plot[i][1];
      if(dis > maxDis){
        maxDis = dis;
        maxPlot = plot[i];
      }else if(dis == maxDis){
        int a = (maxPlot[0] < maxPlot[1]) ? maxPlot[0] : maxPlot[1];
        int b = (plot[i][0] < plot[i][1]) ? plot[i][0] : plot[i][1];
        
        if(a > b){
          maxPlot = plot[i];
        }
      }
    }
    
    maxDis = 0;
    for(int i = 0; i < n; i++){
      int dis = (int)Math.pow(plot[i][0] - maxPlot[0], 2) + (int)Math.pow(plot[i][1] - maxPlot[1], 2);
      
      if(dis > maxDis){
        maxDis = dis;
      }
    }
    
    System.out.println(Math.sqrt(maxDis) / 2);
  }
}