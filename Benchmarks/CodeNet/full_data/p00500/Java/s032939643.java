import java.util.*;
     
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[][] game = new int[N][3];
    	int[] point = new int[N];
    	int flag = 0;
    	
    	for(int i = 0;i < N;i++){
    		for(int j = 0;j < 3;j++){
    			game[i][j] = sc.nextInt();
    		}
    	}
    	
    	for(int i = 0;i < 3;i++){
    		for(int j = 0;j < N;j++){
    			for(int k = 0;k < N;k++){
    				if(game[j][i] == game[k][i])
    					flag++;
    			}
    			if(flag == 1)
    				point[j] += game[j][i];
    			
    			flag = 0;
    		}
    	}
    	
    	for(int i = 0;i < N;i++){
    		System.out.println(point[i]);
    	}
    }
}