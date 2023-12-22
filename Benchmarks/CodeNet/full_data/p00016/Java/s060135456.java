import java.io.*;
import java.util.*;
import java.math.*;

class Main{	
		public static void  calc_tre(ArrayList<Double> a){
			double d,an = 0;
			double x=0,y=0,now_an=0;
			
			for(int i=0;i<a.size()/2;i++){
				d = a.get(i*2);
				an = a.get(i*2+1);
				
				x += d * Math.sin(Math.toRadians(now_an));
				y += d * Math.cos(Math.toRadians(now_an));
				now_an += an;
			}
			
			System.out.print((int)x + "\n" + (int)y);
		}
		
		public static void main(String args[]) throws IOException{
			String str;
			double n1,n2;
			ArrayList<Double> inp = new ArrayList<Double>();
			Scanner scan = new Scanner(System.in);
			
			while(scan.hasNext()){
				str = scan.next();
				String[] strAry = str.split(",");
				n1 = Double.parseDouble(strAry[0]);
				n2 = Double.parseDouble(strAry[1]);
				inp.add(n1);
				inp.add(n2);
			}
			calc_tre(inp);

	}
}