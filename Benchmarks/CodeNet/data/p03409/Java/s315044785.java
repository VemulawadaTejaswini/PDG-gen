import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] reds = new int[n][2];
        for(int i = 0; i < n; i++) {
        	reds[i][0] = sc.nextInt();
        	reds[i][1] = sc.nextInt();
        }

        int[][] blues = new int[n][2];
        for(int i = 0; i < n; i++) {
        	blues[i][0] = sc.nextInt();
        	blues[i][1] = sc.nextInt();
        }
        
        Arrays.sort(reds, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        Arrays.sort(blues, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
    
        boolean[] visited = new boolean[n];
        int cnt = 0;
        int idx = -1;
        
        for(int i = 0; i < n; i++) {
        	int[] blue = blues[i];
        	idx = -1;
        	
        	for(int j = 0; j < n; j++) {
        		if(visited[j]) continue;
        		if(reds[j][0] < blue[0] && reds[j][1] < blue[1] && (idx == -1 || reds[j][1] > reds[idx][1])) {
                    idx = j;
        		}
        	}
        	
        	if(idx == -1) continue;
    		visited[idx] = true;
    		cnt++;
        }
        System.out.println(cnt);
    }
}
