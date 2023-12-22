import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b,c,d,e,f;
		double x,y;
		String ln;
		String[] dat=null;
		while((ln=br.readLine()) != null){
			dat=ln.split(" ");
			a=Integer.parseInt(dat[0]);
			b=Integer.parseInt(dat[1]);
			c=Integer.parseInt(dat[2]);
			d=Integer.parseInt(dat[3]);
			e=Integer.parseInt(dat[4]);
			f=Integer.parseInt(dat[5]);
			y=(double)(c*d-a*f)/(b*d-a*e);
			x=(double)(c-b*y)/a;

			System.out.printf("%.3f %.3f\n",x,y);
			}

	}

}