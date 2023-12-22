import java.util.*;
      
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][][] data = new int[4][3][10];
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
        	int b = sc.nextInt();
        	int f = sc.nextInt();
        	int r = sc.nextInt();
        	int v = sc.nextInt();
        	
        	data[b - 1][f - 1][r - 1] += v;
        }
        
        for(int i = 0;i < 4;i++){
        	for(int k = 0;k < 3;k++){
        		for(int j = 0;j < 10;j++){
        			System.out.print(" "+data[i][k][j]);
        		}
        		System.out.println();
        	}
        	System.out.println("####################");
        }
    }
}
        	
        
        