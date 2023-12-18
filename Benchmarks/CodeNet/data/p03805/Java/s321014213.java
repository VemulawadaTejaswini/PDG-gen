import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        Map<Integer, Node> map = new HashMap<>();
        
        for (int i = 1; i <= N; i++) {
        	Node node = new Node(i);
        	map.put(i, node);
        }
        
        for (int i = 0; i < M; i++) {
        	int from = sc.nextInt();
        	int to = sc.nextInt();
        	
    		Node node = map.get(from);
    		node.list.add(to);
    		
    		node = map.get(to);
    		node.list.add(from);
        }
        
        Node start = map.get(1);
        
        System.out.println(dfs(map, start, new int[N]));
    }
    
    static int dfs(Map<Integer, Node> map, Node node, int[] history) {
    	if (history[node.number - 1] == 1) {
    		return 0;
    	} else {
    		history[node.number - 1] = 1;
    	}
    	
    	if (Arrays.stream(history).sum() == history.length) {
    		return 1;
    	}
    	
    	
    	int ans = 0;
    	for (Integer to : node.list) {
    		
    		int[] tmpHistory = new int[history.length];
        	for (int i = 0; i < history.length; i++) {
        		tmpHistory[i] = history[i];
        	}
    		
    		ans += dfs(map, map.get(to), tmpHistory);
    	}
    	
    	return ans;
    }
    
    static class Node {
    	List<Integer> list;
    	int number;
    	
    	public Node(int number) {
    		this.number = number;
    		list = new ArrayList<>();
    	}
    }
        
}	