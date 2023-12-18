import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int h = sc.nextInt();
      	int w = sc.nextInt();
      	int m[][] = new int[h][w];
      	String sstack; 
      
      	for(int i = 0;i < h;i++){
          for(int j = 0;j < w;j++){
            m[i][j] = 0;
          }
        }
      	
      	for(int i = 0;i < h;i++){
          sstack = sc.next();
          for(int j = 0;j < w;j++){
          	if(sstack.charAt(j) == '#'){
              	m[i][j] = -1;
            	for(int k = -1;k < 2;k++){
                	for(int l = -1;l < 2;l++){
                    	if(i+k>=0 && j+l>=0 &&(k != 0||l != 0) && i+k< h && l+j< w){
                          if(m[i+k][j+l] != -1) m[i+k][j+l]++;
                        }
                    }
                }
            }
          }
        }
      
      for(int i = 0;i < h;i++){
          for(int j = 0;j < w;j++){
            if(m[i][j] != -1) System.out.print(m[i][j]);
            else  System.out.print('#');
          }
         System.out.println();
      }        
	}
}
