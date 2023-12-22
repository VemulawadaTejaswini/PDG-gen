import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> ticket = new ArrayList<Integer>();
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		ArrayList<Integer> d = new ArrayList<Integer>();
		ArrayList<Integer> path = new ArrayList<Integer>();
		while(true){
			int n = in.nextInt();	//ticket num
			int m = in.nextInt();	//city num
			int p = in.nextInt();	//road num
			int a = in.nextInt();	//start city
			int b = in.nextInt();	//end city
			if((n|m|p|a|b) == 0) break;
			for(int i=0; i<n; i++){
				ticket.add(in.nextInt());
			}
			Collections.sort(ticket);
			int speed = ticket.get(ticket.size()-1);
			for(int i=0; i<p; i++){
				x.add(in.nextInt());
				y.add(in.nextInt());
				d.add(in.nextInt());
			}
			double ans = pathfind(speed,9999999,n,m,a,b,x,y,d,path,ticket);
			if(ans == 9999999) System.out.println("Impossible");
			else System.out.println(ans);
			ticket.clear();
			x.clear();
			y.clear();
			d.clear();
			path.clear();
		}
	}
	
	public static double pathfind(int speed, double minimum, int n, int m, int a, int b, ArrayList<Integer> x, ArrayList<Integer> y, ArrayList<Integer> d, ArrayList<Integer> path, ArrayList<Integer> ticket){
		if(n==0 || calc(path,ticket)>minimum) return 9999999;

		for(int i=0; i<x.size(); i++){
			double tmp=9999999;
			if((x.get(i)==a && y.get(i)==b) || (x.get(i)==b && y.get(i)==a)){
				path.add(d.get(i));
				tmp=calc(path,ticket);
				path.remove(path.size()-1);
			}else if(x.get(i)==a){
				path.add(d.get(i));
				tmp = pathfind(speed,minimum,n-1,m,y.get(i),b,x,y,d,path,ticket);
				path.remove(path.size()-1);
			}else if(y.get(i)==a){
				path.add(d.get(i));
				tmp = pathfind(speed,minimum,n-1,m,x.get(i),b,x,y,d,path,ticket);
				path.remove(path.size()-1);				
			}
			if(minimum > tmp) minimum = tmp;
		}
		
		return minimum;
	}
	
	public static double calc(ArrayList<Integer> path, ArrayList<Integer> ticket){
		ArrayList<Integer> paths = new ArrayList<Integer>();
		for(int i=0; i<path.size(); i++){
			paths.add(path.get(i));
		}
		Collections.sort(paths);
		double length = 0;
		for(int i=0; i<paths.size(); i++){
			length = length+(double)paths.get(paths.size()-1-i)/(double)ticket.get(ticket.size()-1-i);
		}
		return length;
	}
}