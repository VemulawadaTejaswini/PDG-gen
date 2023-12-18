import java.util.*;
import java.io.*;

class Point{
	int t,x,y;
	Point(int t, int x, int y){
		this.x = x;
		this.y = y;
		this.t = t;
	}
	
	int distanceTo(Point p){
	    return Math.abs(this.x-p.x)+Math.abs(this.y-p.y);
	}
	boolean canGoTo(Point p){
	    return (distanceTo(p)<=p.t-this.t) && ((distanceTo(p)%2==0)==((p.t-this.t)%2==0));
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Point[] plan = new Point[N+1];
        plan[0]=new Point(0,0,0);
        for(int n=1;n<=N;n++){
        	plan[n] = new Point(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        for(int n=1;n<=N;n++){
        	if(!plan[n-1].canGoTo(plan[n])){
        		System.out.println("No");
        		System.exit(0);
        	}
        }
        System.out.println("Yes");
        
    }
}