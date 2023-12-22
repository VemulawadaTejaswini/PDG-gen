import java.io.*;
import java.util.*;
import java.math.*;

class Main{
		public static void physical(ArrayList<Double> list){
			int res;
			double t,y,ya,v;
			
			for(int i=0;i<list.size();i++){
				v = list.get(i);
				t = v/9.8;
				y = 4.9 * t * t;
				for(int j=1;j<1000;j++){
					ya = 5 * j - 5;
					if(y < ya){System.out.println(j); break;}
				}
			}
			
		}
		
		public static void main(String args[]) throws IOException{
			String str;
			ArrayList <Double> inp = new ArrayList<Double>();
			int out;

			Scanner scan = new Scanner(System.in);
			
			while(scan.hasNext()){
				str = scan.next();
				double x = Double.parseDouble(str);
				inp.add(x);
			}
			physical(inp);
		}
}