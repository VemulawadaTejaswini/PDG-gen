import java.io.*;
import java.util.*;
import java.text.NumberFormat;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s=" ";
		StringTokenizer st;
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMaximumFractionDigits(3);
		formatter.setMinimumFractionDigits(3);
		double a,b,c,d,e,f,x,y;
		try {
			for(;s!=null;){
				s = r.readLine();
				st = new StringTokenizer(s," ");
				a = Double.parseDouble(st.nextToken().toString());
				b = Double.parseDouble(st.nextToken().toString());
				c = Double.parseDouble(st.nextToken().toString());
				d = Double.parseDouble(st.nextToken().toString());
				e = Double.parseDouble(st.nextToken().toString());
				f = Double.parseDouble(st.nextToken().toString());
				x = (double)(b*f-c*e)/(b*d-a*e);
				y = (double)(a*f-c*d)/(a*e-b*d);
				//System.out.print(String.format("%1$3g ",x));
				//System.out.println(String.format("%1$3g",y));
				System.out.print(formatter.format(x)+" "+formatter.format(y));
			}
		} catch (NoSuchElementException err) {
			System.exit(0);
		}
	}
}