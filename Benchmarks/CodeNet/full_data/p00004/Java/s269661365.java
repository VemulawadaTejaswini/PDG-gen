import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
public class Main{
	public static void main(String[] args)  throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str;
		double a,b,c,d,e,f,x,y;
		while((str=br.readLine())!=null){
			String[] num=str.split(" +");
            a = Double.parseDouble(num[0]);
            b = Double.parseDouble(num[1]);
            c = Double.parseDouble(num[2]);
            d = Double.parseDouble(num[3]);
            e = Double.parseDouble(num[4]);
            f = Double.parseDouble(num[5]);
/*			System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
			System.out.println((b*f-c*e)+" "+(b*d-a*e));*/
            x=(b*f-c*e)/(b*d-a*e) == 0 ? 0 : (b*f-c*e)/(b*d-a*e);
            y=(a*f-c*d)/(a*e-b*d) == 0 ? 0 : (a*f-c*d)/(a*e-b*d);
			System.out.printf("%.3f %.3f\n", x,y);

		}
	}

}