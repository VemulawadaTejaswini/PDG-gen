import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		sc = new Scanner(in);

		int H = sc.nextInt();
		int W = sc.nextInt();

		int[][] map = new int[10][10];
		int[] a = new int[10];

		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				map[j][i] = sc.nextInt();
				if(map[j][i] == 0){
					map[j][i] = -1;
				}
			}
		}

		for(int i = 0; i < W*H; i++){
			int j = sc.nextInt();
			if(j >= 0){
				a[j] += 1;
			}
		}

		int answer = 0;
		for(int i = 0; i < 10; i++){
			if(a[i] >= 1){
				int[] distance = new int[10]; 

				dijkstra(map, i, distance);
				
				answer += distance[1] * a[i];
			}
		}

		System.out.println(answer);

	}

	public static void dijkstra(int[][] map,int src,int[] distance) {
		int nTown = distance.length;
		boolean[] fixed = new boolean[nTown]; 
		for (int i=0; i<nTown; i++) { 
		    distance[i] = Integer.MAX_VALUE; 
		    fixed[i] = false;	
		}
		distance[src] = 0;	
		while (true) {
		    
		    int marked = minIndex(distance,fixed);
		    if (marked < 0) return; 
		    if (distance[marked]==Integer.MAX_VALUE) {
		    	return; 
		    }
		    fixed[marked] = true; 
		    for (int j=0; j<nTown; j++) { 
			if (map[j][marked]>0 && !fixed[j]) { 
			    
			    int newDistance = distance[marked]+map[j][marked];
			    
			    if (newDistance < distance[j]) distance[j] = newDistance;
			}
		    }
		}
	    }
	    
	    static int minIndex(int[] distance,boolean[] fixed) {
		int idx=0;
		for (; idx<fixed.length; idx++)	
		    if (!fixed[idx]) break;
		if (idx == fixed.length) return -1; 
		for (int i=idx+1; i<fixed.length; i++) 
		    if (!fixed[i] && distance[i]<distance[idx]) idx=i;
		return idx;
	    }
}