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
		    int DP[][] = new int [H][W];
		    int max = 0;
		    for(int i = 0;i < H;i++){
		    	for(int j = 0;j < W;j++){
		    		int num = sc.nextInt();
		    		if(num == 1)continue;
		    		else DP[i][j] = 1;
		    		max = Math.max(DP[i][j],max);
		    	}
		    }
//		    for(int i = 0;i < H;i++){
//		    	for(int j = 0;j < W;j++){
//		    		System.out.print(DP[i][j]+" ");
//		    	}
//		    	System.out.println();
//		    }
		    for(int i = 1;i < H;i++){
		    	for(int j = 1;j < W;j++){
		    		if(DP[i][j] != 0){
		    			DP[i][j] = Math.min(DP[i-1][j-1],Math.min(DP[i-1][j], DP[i][j-1])) + 1;
		    			max = Math.max(max,DP[i][j]);
		    		}
		    	}
		    }
		    System.out.println(max*max);
		}
	}
}