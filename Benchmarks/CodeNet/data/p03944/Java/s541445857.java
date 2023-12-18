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
      	int count = 0;
      	
      	for(int i = 0; i < n; i++){
        	x[i] = sc.nextInt();
          	y[i] = sc.nextInt();
          	a[i] = sc.nextInt();
        }
      	
      	for(int i = 0; i < n; i++){
        	if(a[i]  == 1){
            	for(int j = 0; j < x[i]; j++){
                	for(int k =0; k < h; k++){
                    	squ[j][k] = false;
                    }
                }
            }else if(a[i]  == 2){
            	for(int j = x[i]; j < w; j++){
                	for(int k = 0; k < h; k++){
                    	squ[j][k] = false;
                    }
                }
            }else if(a[i]  == 3){
            	for(int j = 0; j < w; j++){
                	for(int k = 0; k < y[i]; k++){
                    	squ[j][k] = false;
                    }
                }
            }else if(a[i]  == 4){
            	for(int j = 0; j < w; j++){
                	for(int k = y[i]; k < h; k++){
                    	squ[j][k] = false;
                    }
                }
            }
        }
      	
     	for(int i = 0 ; i < w; i++){
        	for(int j = 0; j < h; j++){
            	if(squ[i][j] == true) count++;
            }
        }
      	System.out.println(count);
    }
  
  	public static boolean[][] beTrue(boolean[][] squ, int w, int h){
    	for(int i = 0; i < w; i++){
        	for(int j = 0; j < h; j++){
            	squ[i][j] = true;
            }
        }
      	return squ;
    }
}