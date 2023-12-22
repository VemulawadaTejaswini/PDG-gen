import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		Points[] a = new Points[n];
		for(int i = 0; i < n; i++) a[i] = new Points();
		for(int i = 0; i < n; i++){
			str = br.readLine().split(" ");
			a[i].x = Integer.parseInt(str[0]);
			a[i].y = Integer.parseInt(str[1]);
		}
		Arrays.sort(a);
		for(int i = 0; i < n; i++) System.out.println(a[i].x + " " + a[i].y);
	}
}

class Points implements Comparable<Points>{
	int x, y;
	@Override
	public int compareTo(Points b){
		return (this.x == b.x ? this.y - b.y : this.x - b.x);
	}
}

