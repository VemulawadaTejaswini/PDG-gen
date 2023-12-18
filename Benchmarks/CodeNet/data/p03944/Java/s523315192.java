//できるだけmainを短くする試み
import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int w = sc.nextInt();
      	int h = sc.nextInt();
      	int n = sc.nextInt();
      	boolean[][] squ = new boolean[w][h];
      	squ = beTrue(squ, w, h);
      	int[] x = new int[n];
	    int[] y = new int[n];
      	int[] a = new int[n];
      	
      	for(int i = 0; i < n; i++){
        	x[i] = sc.nextInt();
          	y[i] = sc.nextInt();
          	a[i] = sc.nextInt();
        }
      	
      	for(int i = 0; i < n; i++){
        	squ = changeSqu(squ, w, h, x[i], y[i], a[i]);
        }
      	
      	System.out.println(countTrue(squ, w, h));
    }  
//配列全部trueにする  
  	public static boolean[][] beTrue(boolean[][] squ, int w, int h){
    	for(int i = 0; i < w; i++){
        	for(int j = 0; j < h; j++){
            	squ[i][j] = true;
            }
        }
      	return squ;
    }
//マス目の塗りつぶし  
  	public static boolean[][] changeSqu(boolean[][] squ, int w, int h, int x, int y, int a){
    	if(a == 1){
          for(int j = 0; j < x; j++){
            for(int k =0; k < h; k++){
              squ[j][k] = false;
            }
          }
        }else if(a == 2){
          for(int j = x; j < w; j++){
            for(int k = 0; k < h; k++){
              squ[j][k] = false;
            }
          }
        }else if(a == 3){
          for(int j = 0; j < w; j++){
            for(int k = 0; k < y; k++){
              squ[j][k] = false;
            }
          }
        }else if(a == 4){
          for(int j = 0; j < w; j++){
            for(int k = y; k < h; k++){
              squ[j][k] = false;
            }
          }
        }
    	return squ;
    }
//trueの個数カウント  	
  	public static int countTrue(boolean[][] squ, int w, int h){
    	int count = 0;
      	for(int i = 0; i < w; i++){
        	for(int j = 0; j < h; j++){
            	if(squ[i][j] == true) count++;
            }
        }
      	return count;
    }
}