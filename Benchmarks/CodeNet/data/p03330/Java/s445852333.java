import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int c_num = sc.nextInt();
      	int[][] d = new int[c_num][c_num];
      	int[][] c = new int[n][n];

      	for(int i = 0 ; i < c_num ; i++){
      		for(int j = 0 ; j < c_num ; j++){
      			d[i][j] = sc.nextInt();
      		}
      	}
      	for(int i = 0 ; i < n ; i++){
      		for(int j = 0 ; j < n ; j++){
      			c[i][j] = sc.nextInt()-1;
      		}
      	}

      	int min = (int)1e9;
      	int[] color = new int[3];
      	int[] swap23 = { 0, 2, 1};
      	for(color[0] = 0 ; color[0] < c_num-2 ; color[0]++){
      		for(color[1] = color[0]+1 ; color[1] < c_num-1 ; color[1]++){
      			for(color[2] = color[1]+1 ; color[2] < c_num ; color[2]++){
      				for(int k = 0 ; k < 3 ; k++){
      					int iwa = 0;
	      				for(int i = 0 ; i < n ; i++){
	      					for(int j = 0 ; j < n ; j++){
	      						iwa += d[c[i][j]][color[(i+j+k)%3]];
	      					}
	      				}
      					min = Math.min(iwa, min);

      					iwa = 0;
	      				for(int i = 0 ; i < n ; i++){
	      					for(int j = 0 ; j < n ; j++){
	      						iwa += d[c[i][j]][color[swap23[(i+j+k)%3]]];
	      					}
	      				}
      					min = Math.min(iwa, min);
      				}
      			}
      		}
      	}

      	System.out.println(min);
    }
}