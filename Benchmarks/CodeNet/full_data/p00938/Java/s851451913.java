import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	
	public static int[][] dirs = {{1, 1}, {1, -1}, {-1, -1}, {-1, 1}};
	
	public static Map<String, Integer> dirToIndex = new HashMap<String, Integer>();
	static {
		dirToIndex.put("E", 0);
		dirToIndex.put("S", 1);
		dirToIndex.put("W", 2);
		dirToIndex.put("N", 3);
	}
	
	// clock-wise
	public static int convertTo1D(final int x, final int y, final int w, final int h){
		if(x == 0){
			return y;
		}else if(y == h){
			return h + x;
		}else if(x == w){
			return h + w + (h - y);
		}else {
			return h + w + h + (w - x);
		}
	}
	
	public static int convertLeft(final int x, final int y, final int w, final int h, final int dir){
		final int x_sign = dirs[dir][0];
		final int y_sign = dirs[dir][1];
		
		final int x_lim = x_sign > 0 ? w : 0;
		final int y_lim = y_sign > 0 ? h : 0;
		
		final int x_diff = Math.abs(x_lim - x);
		final int y_diff = Math.abs(y_lim - y);
		
		final int min_diff = Math.min(x_diff, y_diff);
		
		return convertTo1D(x + min_diff * x_sign, y + min_diff * y_sign, w, h);
	}
	
	public static int convertRight(final int x, final int y, final int w, final int h, final int dir){
		return convertLeft(x, y, w, h, (dir + 1) % dirs.length);
	}
	
	public static class Pair implements Comparable<Pair> {
		int position, value;
		
		public Pair(int position, int value){
			this.position = position;
			this.value = value;
		}

		@Override
		public String toString(){
			return this.position + " " + this.value;
		}
		
		@Override
		public int compareTo(Pair o) {
			if(Integer.compare(this.position, o.position) != 0){
				return Integer.compare(this.position, o.position);
			}else{
				return Integer.compare(o.value, this.value);
			}
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int w = sc.nextInt();
		final int h = sc.nextInt();
		
		int[] ls = new int[n];
		int[] rs = new int[n];
		
		for(int i = 0; i < n; i++){
			final int x = sc.nextInt();
			final int y = sc.nextInt();
			final String d = sc.next();
			
			ls[i] = convertLeft(x, y, w, h, dirToIndex.get(d));
			rs[i] = convertRight(x, y, w, h, dirToIndex.get(d));
			if(ls[i] > rs[i]){ rs[i] += 2 * (h + w); }
		}
		
		//System.out.println(Arrays.toString(ls));
		//System.out.println(Arrays.toString(rs));
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++){
			int[] n_ls = new int[n];
			int[] n_rs = new int[n];
			System.arraycopy(ls, 0, n_ls, 0, n);
			System.arraycopy(rs, 0, n_rs, 0, n);
			
			final int origin = ls[i];
			for(int j = 0; j < n; j++){
				n_ls[j] -= origin;
				while(n_ls[j] < 0){ n_ls[j] += 2 * (w + h); }
				while(n_ls[j] >= 2 * (w + h)){ n_ls[j] -= 2 * (w + h); }
				
				n_rs[j] -= origin;
				while(n_rs[j] < 0){ n_rs[j] += 2 * (w + h); }
				while(n_rs[j] >= 2 * (w + h)){ n_rs[j] -= 2 * (w + h); }
				
				if(n_rs[j] < n_ls[j]){
					int tmp = n_ls[j];
					n_ls[j] = n_rs[j];
					n_rs[j] = tmp;
				}
				//System.out.println(n_ls[j] + " " + n_rs[j]);
			}
			
			TreeSet<Integer> set = new TreeSet<Integer>();
			for(int j = 0; j < n; j++){
				set.add(n_ls[j]);
				set.add(n_rs[j] + 1);
			}
			ArrayList<Integer> list = new ArrayList<Integer>(set);
			int[] array = new int[list.size()];
			for(int j = 0; j < n; j++){
				array[Collections.binarySearch(list, n_ls[j])]++;
				array[Collections.binarySearch(list, n_rs[j] + 1)]--;
			}
			
			for(int j = 1; j < array.length; j++){
				array[j] += array[j - 1];
			}
			
			int score = 0;
			boolean prev = false;
			for(int j = 0; j < array.length; j++){
				if(!prev && array[j] >= 1){
					prev = true;
				}else if(prev && array[j] == 0){
					prev = false;
					score++;
				}
			}
			
			if(prev){
				score++;
			}
			
			min = Math.min(min, score);
		}
		
		System.out.println(min);
		
		sc.close();
	}	
}