
import java.util.*;
import java.math.*;

 class Main {
     static boolean[][] graph = new boolean[8][8];

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long Nw= N;
        long[] insu=new long[100];
        int k=0;
        long root = (long) Math.pow(N,1.0/2.0);
        
        for(long i=2;i<root;i++) {
        	if(Nw%i==0) {
        		Nw=Nw/i;
        		if(Nw==1) {
        			break;
        		}
            	root = (long) Math.pow(Nw,1.0/2.0)+1;
        		insu[k]=i;
//                System.out.println(i);
        		k++;
            	i=1;
        	}
        }
        insu[k]=Nw;
//        System.out.println(Nw);
//        System.out.println("k="+k);
        long A=1;
        long B=1;
        for(int i=k;i>=0;i--) {
        	if(A<B) {
        		A=A*insu[i];
        	}else {
        		B=B*insu[i];
        	}
        }
//        System.out.println(A);
//        System.out.println(B);
        
        long result=Math.max(A, B);
        System.out.println(String.valueOf(result).length());
    }
    
    static int dfs(int first, int max, boolean[] visited) {
    	int ret = 0;
    	boolean all_visited = true;
    	for(int i=0;i<max;i++) {
    		if(visited[i]==false) {
    			all_visited=false;    			
    		}
    	}
    	if (all_visited) {
    		return 1;
    	}
    	
    	for(int i=0;i<max;i++) {
    		if(graph[first][i]==false) {
    			continue;
    		}
    		if(visited[i]==true) {
    			continue;
    		}
    		visited[i]=true;
			ret += dfs(i,max,visited);
			visited[i] = false;
    	}
    	return ret;
    }
}