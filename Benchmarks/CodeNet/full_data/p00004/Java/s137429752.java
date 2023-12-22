import java.io.*;
import java.math.BigDecimal;


public class Main {
	public static void main(String[] args) throws IOException {
		// System.out.println("Hello world");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		while(true){
			double x, y;
			int n = 6;
			String c = br.readLine();
			if(c == null)
				break;
			double[] arr = new double[n];
			for(int i = 0; i < n; i++){
				if(c.indexOf(" ") !=  -1){
					String str = c.substring(0, c.indexOf(" "));
					arr[i] =Double.parseDouble(str);
					c = c.substring(c.indexOf(" ") + 1);
				}
				else{
					arr[i] =Double.parseDouble(c);
				}
			}
			x = (arr[2]*arr[4] - arr[1]*arr[5]) / (arr[0]*arr[4] - arr[1]*arr[3]);
			y = (arr[2]-arr[0]*x)/ arr[1];

			if(x == -0)
				x *= -1;
			if(y == -0)
				y *= -1;
			
			System.out.printf("%.3f %.3f\n", x, y);
		}
	}
		

	  private static double round(double d){
		    int newScale = 3; // ツ渉ャツ青板点ツ暗按可コ6ツ個づ慊づ仰づ淞づゥ
		    BigDecimal bd = new BigDecimal(d);
		    BigDecimal bd2 = bd.setScale(newScale, BigDecimal.ROUND_HALF_UP);
		    double d2 = bd2.doubleValue();
		    return d2;
		  }
	  private static void keta(double d){
		  int k = (int)d;
		  System.out.print(k + ".");
		  d = d-k;
		  if(d < 0)
			  d *= -1;
		  d = round(d);
		  d *= 1000;
		  k = (int)d;
		  if(k == 0)
			  System.out.print("000");
		  else
			  System.out.print(String.format("%03", k));
	  }
}