import java.io.*;
import java.util.*;

public class Main{
	public static int maxTreesInEst(int[][] map, int W_est, int H_est){
		int max=0;
		int trees;
    	for(int i=0; i+W_est<= map.length ; i++){
      	 for(int j=0; j+H_est<= map[0].length ; j++){
      		trees=0;
      		for(int x=0; x<W_est; x++){
      		 for(int y=0; y<H_est; y++){
      			trees+= map[i+x][j+y];
      		 }
      		}
      		if( max<trees ){ max= trees; }
      	 }
      	}
    	return max;
	}
    public static void main(String args[]) throws Exception{
    	Scanner sc= new Scanner(System.in);
    	int N,W_map,H_map,W_est,H_est;
    	int x,y;
    	while( (N= sc.nextInt()) != 0 ){
    		W_map= sc.nextInt();
    		H_map= sc.nextInt();
        	int[][] map= new int[W_map][H_map];
        	for(int i=0;i<N;i++){
        		x= sc.nextInt()-1;
        		y= sc.nextInt()-1;
        		map[x][y]= 1;
        	}
        	W_est= sc.nextInt();
        	H_est= sc.nextInt();
        	System.out.println( maxTreesInEst(map,W_est,H_est) );
    	}
    }
}