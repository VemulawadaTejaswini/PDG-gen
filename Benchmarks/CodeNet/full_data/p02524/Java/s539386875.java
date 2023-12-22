import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		new Main().calc();
	}
	void calc(){
		double a=0,b=0,c=0,s,l,h;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String	 str 	= br.readLine();
			String[] strs	= str.split(" ");
			a = Double.parseDouble(strs[0]);
			b = Double.parseDouble(strs[1]);
			c = Double.parseDouble(strs[2]);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		s = (a*b * Math.sin(Math.toRadians(c)))/2;
		l = a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(c)));
		h = 2 * s / a;
		
		System.out.printf("%f\n%f\n%f\n",s,l,h);
	}
}