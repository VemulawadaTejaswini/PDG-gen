import java.io.*;
import java.util.*;
import java.math.*;

class Main{
		public static int circle_calc(ArrayList<Double> list){
			int res;
			double xa,ya,ra,xb,yb,rb,d;
			
			xa = list.get(0);
			ya = list.get(1);
			ra = list.get(2);
			xb = list.get(3);
			yb = list.get(4);
			rb = list.get(5);
			
			d = (xb-xa)*(xb-xa)+(yb-ya)*(yb-ya);
			d = Math.sqrt(d);
			
			if(d<Math.abs(ra-rb)){
				if(ra>rb)
					res = 2;
				else res = -2;
					
			}
			else if(d > ra+rb)
				res = 0;
			else res = 1;
					
			return res;
		}
		
		public static void main(String args[]) throws IOException{
			String str;
			ArrayList <Double> inp = new ArrayList<Double>();
			int out;

			Scanner scan = new Scanner(System.in);
			str = scan.next();
			
			while(scan.hasNext()){
				inp.clear();
				
				for(int i=0;i<6;i++){
					str = scan.next();
					double x = Double.parseDouble(str);
					inp.add(x);
				}
				out = circle_calc(inp);
				System.out.println(out);
			}
		}
}