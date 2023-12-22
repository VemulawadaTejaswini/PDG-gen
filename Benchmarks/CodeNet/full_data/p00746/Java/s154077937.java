import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		while(true){
			int t = in.nextInt();
			if(t==0) break;
			x.add(0);
			y.add(0);
			for(int i=0; i<t-1; i++){
				int n = in.nextInt();
				int d = in.nextInt();
				switch(d){
				case 0:
					x.add(x.get(n)-1);
					y.add(y.get(n));
					break;
				case 1:
					x.add(x.get(n));
					y.add(y.get(n)+1);
					break;
				case 2:
					x.add(x.get(n)+1);
					y.add(y.get(n));
					break;
				case 3:
					x.add(x.get(n));
					y.add(y.get(n)-1);
					break;
				}
			}
			int max_x=0;
			int min_x=0;
			int max_y=0;
			int min_y=0;
			for(int i=0; i<t; i++){
				if(max_x<x.get(i)) max_x = x.get(i);
				if(min_x>x.get(i)) min_x = x.get(i);
				if(max_y<y.get(i)) max_y = y.get(i);
				if(min_y>y.get(i)) min_y = y.get(i);
			}
			System.out.println((max_x-min_x+1)+" "+(max_y-min_y+1));
			x.clear();
			y.clear();
		}
	}
}