import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      String[][] grid = new String[h][w];
      int[] ph = new int[h];
      int[] pw = new int[w];
      for(int i = 0;i < h;i++){
      	for(int j = 0;j < w;j++){
          String str = sc.next();
          grid[i][j] = str.substring(j,j+1);
          if(grid[i][j].equals("#")){
          	ph[i]++;
            pw[j]++;
          }
          
        }
      }
      for(int i = 0;i < h;i++){
      	for(int j = 0;j < w;j++){
        	if(ph[i] > 0 && pw[j] > 0){
            	System.out.print(grid[i][j]);
            }
        }
        if(ph[i] > 0){
        	System.out.println("");
        }
      }
    }
}