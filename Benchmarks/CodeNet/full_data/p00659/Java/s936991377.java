import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;
			Data[] data = new Data[n];
			int[] time = new int[31];
			for(int i = 0; i < n; i++) {
				Data tmp = new Data();
				tmp.name = sc.next();
				tmp.m = sc.nextInt();
				tmp.d = new int[tmp.m];
				for(int j = 0; j < tmp.m ; j++) {
					tmp.d[j] = sc.nextInt();
					time[tmp.d[j]]++;
				}
				data[i] = tmp;
			}
			for(int i = 0; i < n; i++) {
				Data tmp = data[i];
				for(int j = 0; j < tmp.m; j++) {
					tmp.point += Math.max(1, n - time[tmp.d[j]]+1);
				}
			}
			Arrays.sort(data);
			
			System.out.println(data[data.length-1].point + " " + data[data.length-1].name);
			
			
			
			
			
			
			
			
			
		}
	}
	static class Data implements Comparable<Data> {
		String name;
		int m;
		int[] d = new int[m];
		int point;
		@Override
		public int compareTo(Data o) {
			if(this.point == o.point) return this.name.compareTo(o.name);
			return o.point - this.point;
		}
		
	}
}