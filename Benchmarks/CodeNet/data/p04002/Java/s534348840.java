import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
        	int h = cin.nextInt();    
        	int w = cin.nextInt(); 
        	int n = cin.nextInt(); 
        	int[][] graph = new int[h][w];
        	for(int i=0;i<n;i++){
        		graph[cin.nextInt()-1][cin.nextInt()-1]=1;
        	}
        	System.out.println(count(graph,h,w));
        }
    }
    public static long[] count(int[][] graph,int h,int w){
    	long[] count = new long[10];
    	int[][] g3 = new int[h][w-2];
    	int[][] gw3 = new int[h][w-2];
    	for(int x=0;x<h;x++){
    		g3[x][0] = graph[x][0]+graph[x][1]+graph[x][2];
    		for(int y=1;y<w-2;y++){
    			g3[x][y]=g3[x][y-1]+graph[x][y+2]-graph[x][y-1];
    		}
    	}
    	for(int x=0;x<w-2;x++){
    		gw3[0][x] = g3[0][x]+g3[1][x]+g3[2][x];
    		count[gw3[0][x]]++;
    		for(int y=1;y<h-2;y++){
    			gw3[y][x]=gw3[y-1][x]+g3[y+2][x]-g3[y-1][x];
    			count[gw3[y][x]]++;
    		}
    	}
    	return count;
    }
}