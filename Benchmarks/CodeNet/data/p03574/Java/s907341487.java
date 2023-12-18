import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      char[][] bomb = new char[h][w];
      int[][] count = new int[h][w];
      for(int i = 0;i < h;i++)bomb[i] = sc.next().toCharArray();
      
      for(int i = 0;i < h;i++){
      	for(int j = 0;j < w;j++){
        	if(bomb[i][j]=='.'){
            	for(int k = -1;k <= 1;k++){
                	for(int l = -1;l <= 1;l++){
                    	if(i+k>=0&&j+l>=0&&i+k<=h-1&&j+l<=w-1&&bomb[i+k][j+l]=='#')count[i][j]++;
                    }
                }
            }
        }
      }
      for(int i = 0;i < h;i++){
      	for(int j = 0;j < w;j++){
        	if(bomb[i][j]=='.')System.out.print(count[i][j]);
          else System.out.print('#');
        }
        System.out.println("");
      }
    }
}