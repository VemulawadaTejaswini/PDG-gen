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
				if(x<=0.0&&x>-0.0009)x=(double)0;
				if(y<=0.0&&y>-0.0009)y=(double)0;
				System.out.println(formatter.format(x)+" "+formatter.format(y));
			}
		} catch (NoSuchElementException err) {
			System.exit(0);
		}
	}
}