import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string, str[];
		
		int n, t;
		double x, y, x1, y1, maxslope, tmp, d, h;
		while(!(string = reader.readLine()).equals("0")){
			n = Integer.valueOf(string);
			
			ArrayList<Pair> list = new ArrayList<Pair>();
			ArrayList<Integer> res = new ArrayList<Integer>();
			for(int i = 0; i < n; i++){
				str = reader.readLine().split(",");
				
				x = Double.parseDouble(str[0]);
				y = Double.parseDouble(str[1]);
				list.add(new Pair(x, y));
			}
			Collections.sort(list);
			
			double dx = list.get(0).x;
			double dy = list.get(0).y;
			
			t = 1;
			maxslope = (list.get(1).y - dy) / (list.get(1).x - dx);
			for(int i = 2; i < n; i++){
				x = list.get(i).x;
				y = list.get(i).y;
				
				tmp = (y - dy) / (x - dx);
				if(maxslope < tmp){
					maxslope = tmp;
					t = i;
				}
			}
			
			res.add(0);
			res.add(t);
			while(true){
				h = 0;
				t = 0;
				for(int i = 0; i < n; i++){
					x = list.get(i).x;
					y = list.get(i).y;
					
					x1 = list.get(res.get(res.size() - 1)).x;
					y1 = list.get(res.get(res.size() - 1)).y;
					
					dx = list.get(res.get(res.size() - 2)).x;
					dy = list.get(res.get(res.size() - 2)).y;
					
					dx = dx - x1;
					dy = dy - y1;
					
					x = x - x1;
					y = y - y1;
					
					d = ((dx * x) + (dy * y)) / (Math.hypot(dx, dy) * Math.hypot(x, y));
					d = Math.acos(d);
					if(h < d){
						t = i;
						h = d;
					}
				}
				if(t == 0) break;
				res.add(t);
			}
			
			System.out.println(n - res.size());
		}
		reader.close();
	}
}

class Pair implements Comparable<Pair>{
	double x;
	double y;
	
	Pair(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Pair o) {
		return x > o.x ? 1 : -1;
	}
}