import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    static int[][] e = new int[1 + 1000*(1000 - 1)/2][2];
    static int[] calculated = new int[1 + 1000*(1000 - 1)/2];
    static int[] visited = new int[1 + 1000*(1000 - 1)/2];
    static int[] depth = new int[1 + 1000*(1000 - 1)/2];
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int[][] v = new int[n][n];
		int id = 0;
		int currentId = 0;
		int prevId = 0;

        for(int k = 0; k < n; k++){
            for(int l = 0; l < n - 1; l++){
                int i = k;
                int j = sc.nextInt() - 1;
                int m = 0;
                if(i > j){
                    int tmp = j;
                    j = i;
                    i = tmp;
                    m = 1;
                }
                if(v[i][j] == 0){
                    id++;
                    v[i][j] = id;
                    //System.out.println((i+1) + "vs" + (j+1) + ":" + id);
                }
                currentId = v[i][j];
                if(prevId == 0){
                    prevId = v[i][j];
                }else{
                    e[currentId][m] = prevId;
                    prevId = currentId;
                    //System.out.println("e[" + currentId + "][" + m + "] = " + e[currentId][m]);
                }
            }
            prevId = 0;
            currentId = 0;
        }
        
		// 計算
		/*
		System.out.println(id);
		for(int i = 1; i <= id; i++){
		    if(e[id][0] == 0 && e[id][1] == 0){
	            System.out.println(i + ":");
		    }else{
    		    System.out.println(i + ":" + e[id][0] + " " + e[id][1]);	        
		    }
		}
		*/
		int result = 0;
		for(int i = 1; i <= id; i++){
		    int res = dfs(i);
		    if(res == -1){
		        result = -1;
		        break;
		    }
		    result = max(result, res);
		}

		// 出力
		System.out.println(result);
	}
	
	static int dfs(int id){
	    if(visited[id] == 1){
    	    if(calculated[id] == 1) return depth[id];
    	    return -1;
	    }
	    visited[id] = 1;
	    depth[id] = 1;
	    if(e[id][0] == 0 && e[id][1] == 0){
    	    calculated[id] = 1;
	        return depth[id];
	    }
	    for(int i = 0; i < e[0].length; i++){
	        if(e[id][i] == 0) continue;
	        int res = dfs(e[id][i]);
	        if(res == -1) return -1;
	        depth[id] = max(depth[id], res + 1);
	    }
	    calculated[id] = 1;
	    return depth[id];
	}
	
}
