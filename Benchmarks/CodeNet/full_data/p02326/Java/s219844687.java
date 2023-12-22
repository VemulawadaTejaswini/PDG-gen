import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new D().doIt();
	}
	class D{
		void doIt(){
		    int H = sc.nextInt();
		    int W = sc.nextInt();
		    boolean map[][] = new boolean[H][W];
		    int DP[][] = new int [H][W];
		    for(int i = 0;i < H;i++){
		    	for(int j = 0;j < W;j++){
		    		int num = sc.nextInt();
		    		if(num == 0)map[i][j] = true;
		    		else map[i][j] = false;
		    	}
		    }
		    for(int i = 0;i < H;i++){
		    	if(map[i][W-1])DP[i][W-1] = 1;
		    }
		    for(int i = 0;i < W;i++){
		    	if(map[H-1][i])DP[H-1][i] = 1;
		    }
		    int max = 0;
		    for(int i = 1;i < H;i++){
		    	for(int j = 1;j < W;j++){
		    		if(map[i][j]){
		    			DP[i][j] = Math.min(DP[i-1][j-1],Math.min(DP[i-1][j], DP[i][j-1])) + 1;
		    			max = Math.max(max,DP[i][j]);
		    		}
		    	}
		    }
		    System.out.println(max*max);
		}
	}
}