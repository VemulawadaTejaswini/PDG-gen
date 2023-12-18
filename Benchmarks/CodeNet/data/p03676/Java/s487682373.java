
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        long etc = (long)Math.pow(10, 9) + 7;
        for(int i=0;i<n+1;i++){
        	a[i] = sc.nextInt();
        }
        ArrayList<Point> list = new ArrayList<Point>();
        int[] judge = new int[n+1];
        long[] num = new long[n+2];
        num[0] = 1;
        Arrays.fill(judge, -1);
        for(int i=0;i<n+1;i++){
        	if(judge[a[i]] == -1){
        		judge[a[i]] = i;
        	}
        	else{
        		Point p = new Point(0, 0);
        		p.x = judge[a[i]];
        		p.y = n-i;
        		list.add(p);
        	}
        }
        for(int i=1;i<=n+1;i++){
        	num[i] = num[i-1]*(n+2-(long)i)/i;
        }
        for(int i=1;i<=n;i++){
        	long count = 1;

        	if(i==1){
        		count = n + 1 - list.size();
        	}
        	else{
        		int y = n+1;
        		count = num[i];
        		for(int j=0;j<list.size();j++){
        			Point p = list.get(j);
        			long counter = 1;
        			int z = p.x + p.y;
        			if(z<i-1){
        				continue;
        			}
        			for(int k=1;k<i;k++){
        				counter *= (long)z;
        				counter /= (long)k;
        				z--;
        			}
        			count -= counter;
        			count = count%etc;
        		}
        	}

        	System.out.println(count%etc);
        }
        System.out.println(1);

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
