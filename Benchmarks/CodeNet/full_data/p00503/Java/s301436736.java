import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		
		int[][] fish = new int[N][6];
		
		TreeSet<Integer> x_tree = new TreeSet<Integer>();
		TreeSet<Integer> y_tree = new TreeSet<Integer>();
		TreeSet<Integer> d_tree = new TreeSet<Integer>();
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < 6; j++){
				fish[i][j] = sc.nextInt();
				
				switch(j % 3){
				case 0:
					x_tree.add(fish[i][j]);
					break;
				case 1:
					y_tree.add(fish[i][j]);
					break;
				case 2:
					d_tree.add(fish[i][j]);
					break;
				}
			}
		}
		
		ArrayList<Integer> x_list = new ArrayList<Integer>(x_tree);
		ArrayList<Integer> y_list = new ArrayList<Integer>(y_tree);
		ArrayList<Integer> d_list = new ArrayList<Integer>(d_tree);
		
		final int x_size = x_list.size();
		final int y_size = y_list.size();
		final int d_size = d_list.size();
		
		int[] x_dist = new int[x_size - 1];
		int[] y_dist = new int[y_size - 1];
		int[] d_dist = new int[d_size - 1];
		for(int x = 0; x < x_size - 1; x++){
			x_dist[x] = x_list.get(x + 1) - x_list.get(x);
		}
		for(int y = 0; y < y_size - 1; y++){
			y_dist[y] = y_list.get(y + 1) - y_list.get(y);
		}
		for(int d = 0; d < d_size - 1; d++){
			d_dist[d] = d_list.get(d + 1) - d_list.get(d);
		}
		
		int[][][] area = new int[d_size - 1][y_size - 1][x_size - 1];
		long sum = 0;
		
		for(int i = 0; i < N; i++){
			int x_start = Collections.binarySearch(x_list, fish[i][0]);
			int y_start = Collections.binarySearch(y_list, fish[i][1]);
			int d_start = Collections.binarySearch(d_list, fish[i][2]);
			int x_end   = Collections.binarySearch(x_list, fish[i][3]);
			int y_end   = Collections.binarySearch(y_list, fish[i][4]);
			int d_end   = Collections.binarySearch(d_list, fish[i][5]);
			
			if(x_start < 0){
				x_start = -(x_start + 1);
			}
			if(y_start < 0){
				y_start = -(y_start + 1);
			}
			if(d_start < 0){
				d_start = -(d_start + 1);
			}
			
			if(x_end < 0){
				x_end = -(x_end + 2);
			}else{
				x_end--;
			}
			if(y_end < 0){
				y_end = -(y_end + 2);
			}else{
				y_end--;
			}
			if(d_end < 0){
				d_end = -(d_end + 2);
			}else{
				d_end--;
			}
			
			for(int d = d_start; d <= d_end; d++){
				for(int y = y_start; y <= y_end; y++){
					for(int x = x_start; x <= x_end; x++){
						if(area[d][y][x] >= K){
							continue;
						}else{
							area[d][y][x]++;
							
							if(area[d][y][x] >= K){
								long x_d = x_dist[x];
								long y_d = y_dist[y];
								long d_d = d_dist[d];
								sum += (x_d * y_d * d_d);
							}
						}
					}
				}
			}
		}
		
		System.out.println(sum);
	}

}