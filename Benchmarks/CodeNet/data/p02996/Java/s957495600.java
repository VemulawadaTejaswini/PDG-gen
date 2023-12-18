
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> list = new ArrayList<Point>();
        for(int i=0;i<n;i++){
        	Point p = new Point(sc.nextInt(), sc.nextInt());
        	list.add(p);
        }

        list.sort((p, q) -> p.y - q.y);

        int time = 0;
        boolean flag = true;
        for(int i=0;i<n;i++){
        	Point p = list.get(i);
        	time += p.x;
        	if(time > p.y){
        		flag = false;
        		break;
        	}
        }

        if(flag){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
    }
}

class Point{
	int x;
	int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}