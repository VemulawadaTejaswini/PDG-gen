import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      int[][] p = new int[h][w];
      for(int i = 0;i< h-b;i++){
      	for(int j = 0;j < w-a;j++)p[i][j]=1;
      }
      for(int i = h-b;i < h;i++){
      	for(int j = w-a;j < w;j++)p[i][j]=1;
      }
      for(int i = 0;i < h;i++){
      	for(int j = 0;j < w;j++)System.out.print(p[i][j]);
        System.out.println("");
      }
    }
}