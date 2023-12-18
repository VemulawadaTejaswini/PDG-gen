
import java.io.*;
import java.util.*;

class XComparator implements Comparator<Point>{
	@Override
	public int compare(Point p1, Point p2){
		return p1.x < p2.x ? -1 : 1;
	}
}

class YComparator implements Comparator<Point>{
	@Override
	public int compare(Point p1, Point p2){
		return p1.y < p2.y ? -1 : 1;
	}
}

class MyComparator implements Comparator<Next>{
	@Override
	public int compare(Next p1, Next p2){
		return p1.cost < p2.cost ? -1 : 1;
	}
}

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        boolean[] flag = new boolean[n];
        Arrays.fill(flag, true);
        for(int i=0;i<n;i++){
        	x[i] = sc.nextInt();
        	y[i] = sc.nextInt();
        }
        ArrayList<Point> xlist = new ArrayList<Point>();
        ArrayList<Point> ylist = new ArrayList<Point>();
        for(int i=0;i<n;i++){
        	Point p = new Point(x[i], y[i], i);
        	xlist.add(p);
        	ylist.add(p);
        }
        Collections.sort(xlist, new XComparator());
        Collections.sort(ylist, new YComparator());

    	ArrayList<Next> list = new ArrayList<Next>();

        for(int i=0;i<n-1;i++){
        	Point p1 = xlist.get(i);
        	Point p2 = xlist.get(i+1);
        	list.add(new Next(p1.now, p2.now, (int)Math.abs(p1.x-p2.x)));
        	p1 = ylist.get(i);
        	p2 = ylist.get(i+1);
        	list.add(new Next(p1.now, p2.now, (int)Math.abs(p1.y-p2.y)));
        }

        Collections.sort(list, new MyComparator());
        int count = 0;
        int now = 0;
        long ans = 0;
        while(list.size()>now){
        	Next p = list.get(now);
        	if(!flag[p.a] && !flag[p.b]){

        	}
        	else{
        		if(flag[p.a]){
        			flag[p.a] = false;
        			count++;
        		}
        		if(flag[p.b]){
        			flag[p.b] = false;
        			count++;
        		}
        		ans += (long)p.cost;
        	}
        	if(count >= n){
        		break;
        	}
        	now++;
        }

        System.out.println(ans);
    }
}

class Point{
	int x;
	int y;
	int now;
	Point(int x, int y, int now){
		this.x = x;
		this.y = y;
		this.now = now;
	}
}

class Next{
	int a;
	int b;
	int cost;
	Next(int a, int b, int cost){
		this.a = a;
		this.b = b;
		this.cost = cost;
	}
}