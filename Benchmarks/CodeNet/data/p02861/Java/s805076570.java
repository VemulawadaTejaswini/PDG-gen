import java.util.*;

public class Main {
    static double totalDist = 0;
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int[][] coord = new int[n][2];
        for(int i = 0; i < n; i++) {
        	coord[i][0] = sc.nextInt();
        	coord[i][1] = sc.nextInt();
        }
        List<Integer> posSet = new ArrayList<>();
        boolean[] visited = new boolean[n];
        dfs(coord, posSet, visited);
        
        int f = 1;
        for(int i = 1; i <= n; i++) {
        	f *= i;
        }
        
        System.out.println(totalDist / f);
    }

    private static void dfs(int[][] coord, List<Integer> posSet, boolean[] visited) {
    	if(posSet.size() == coord.length) {
    		totalDist += calDist(posSet, coord);
    		return;
    	}
    	for(int i = 0; i < coord.length; i++) {
    		if(visited[i])	continue;
    		visited[i] = true;
    		posSet.add(i);
    		dfs(coord, posSet, visited);
    		posSet.remove(posSet.size()-1);
    		visited[i] = false;
    	}
    }

    private static double calDist(List<Integer> pos, int[][] coord) {
    	double dist = 0;
    	for(int i = 1; i < pos.size(); i++) {
    	    int prevIdx = pos.get(i-1);
    	    int curIdx = pos.get(i);
    		dist += Math.hypot(coord[curIdx][0] - coord[prevIdx][0], 
    			coord[curIdx][1] - coord[prevIdx][1]
    		);
    	}
    	return dist;
    }
}
