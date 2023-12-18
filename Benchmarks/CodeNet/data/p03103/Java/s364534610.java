
import java.io.*;
import java.util.*;

class MyComparator implements Comparator{
	public int compare(Object arg0, Object arg1){
		Point x = (Point)arg0;
		Point y = (Point)arg1;

		if(x.x > y.x){
			return 1;
		}
		else if(x.x < y.x){
			return -1;
		}
		else{
			return 0;
		}
	}
}

class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Main{
	public static final Comparator Comp = new MyComparator();
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
        	a[i] = sc.nextInt();
        	b[i] = sc.nextInt();
        }
        long ans = 0;

        PriorityQueue pq = new PriorityQueue(n, Comp);
        for(int i=0;i<n;i++){
        	Point p = new Point(a[i], b[i]);
        	pq.add(p);
        }

        while(m>0){
        	Point p = (Point)pq.poll();
        	int x = (int)p.x;
        	int y = (int)p.y;
        	if(y<=m){
        		ans += (long)x * (long)y;
        		m -= y;
        	}
        	else{
        		ans += (long)x * (long)m;
        		m = 0;
        	}
        }

        System.out.println(ans);
    }
}