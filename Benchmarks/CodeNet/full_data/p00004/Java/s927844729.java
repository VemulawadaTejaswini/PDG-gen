import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
//import java.util.ArrayList;
//import java.util.List;


public class Main {
	public static void main(String[] args)throws IOException {
		
		BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df=new DecimalFormat("0.000");
		double a,b,c,d,e,f,x,y;
		//List<String> xlist=new ArrayList<String>();
		//List<String> ylist=new ArrayList<String>();
		
		String line;
		while((line=buf.readLine())!=null){
			a=Integer.parseInt(line.split(" ")[0]);
			b=Integer.parseInt(line.split(" ")[1]);
			c=Integer.parseInt(line.split(" ")[2]);
			d=Integer.parseInt(line.split(" ")[3]);
			e=Integer.parseInt(line.split(" ")[4]);
			f=Integer.parseInt(line.split(" ")[5]);
			
			x=(e*c-b*f)/(e*a-b*d);
			y=(d*c-a*f)/(d*b-a*e);
			//xlist.add(df.format(x));
			//ylist.add(df.format(y));
			System.out.println(df.format(x)+" "+df.format(y));
		}
		/*
		for(int i=0;i<xlist.size();i++){
			System.out.println(xlist.get(i)+" "+ylist.get(i));
		}
		*/
	}
}