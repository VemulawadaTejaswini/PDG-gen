import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
		}
		System.out.println(doSort(w));
	}
	
	public static int getIndex(int[] l, int x){
		for (int i = 0; i < l.length; i++) {
			if(l[i]==x) return i;
		}
		return -1;
	}
	
	public static int doSort(int[] w){
		int[] sortedList = w.clone();
		Arrays.sort(sortedList);
		
		int cost = 0;
		
		for (int i = 0; i < w.length; i++) {
			int x = getIndex(w, sortedList[i]);
			int y = 0;
			while (x>i) {
				y++;
				int k = getIndex(w, sortedList[x]);
				cost = cost + w[k];
				int comp = w[x];
				w[x] = w[k];
				w[k] = comp;
				x = k;
			}
			cost = cost + Math.min(sortedList[i]*y, sortedList[i]*2+sortedList[0]*(y+2));
		
		}
		return cost;
	}
	
}
