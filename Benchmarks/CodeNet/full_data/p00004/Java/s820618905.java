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
		if(c == 0)
			break;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			if(c.indexOf(" ") !=  -1){
				String str = c.substring(0, c.indexOf(" "));
				arr[i] = Integer.parseInt(str);
				c = c.substring(c.indexOf(" ") + 1);
			}
			else{
				arr[i] = Integer.parseInt(c);
			}
		}
		
		int[] arr2 = arr.clone();
		int k1=1, k2=1;
		if(!(arr2[0] == 0 || arr2[3] == 0)){
			while(arr2[0]%arr2[3] != 0){
				arr2[0] += arr[0]; 
				k1++;
			}
			k2 = arr2[0]/arr2[3];
			for(int i = 1; i < n; i++){
				if(i < 3)
					arr2[i] = arr2[i] * k1;
				else
					arr2[i] = arr2[i] * k2;
			}
		}
		else if(!(arr2[1] == 0 || arr2[4] == 0)){
			while(arr2[1]%arr2[4] != 0){
				arr2[1] += arr[1]; 
				k1++;
			}
			k2 = arr2[1]/arr2[4];
			for(int i = 1; i < n; i++){
				if(i < 3)
					arr2[i] = arr2[i] * k1;
				else
					arr2[i] = arr2[i] * k2;
			}
		}
		else{
			if(arr[0] == 0){
				y = (double)arr[2] / (double)arr[1];
				x = (double)arr[5] / (double)arr[3];
			}
			else{ 
				x = (double)arr[2] / (double)arr[0];
				y = (double)arr[5] / (double)arr[4];
			}
		}

		arr2[1] = arr2[1] - arr2[4];
		arr2[2] = arr2[2] - arr2[5];
		
		y = (double)arr2[2] / (double)arr2[1];
		
		x = (double)arr[2]-(double)arr[1]*y;

		//System.out.println(round(x) +" "+ round(y));
		
		//System.out.println(String.format("%1$.4g", x) + " " + String.format("%1$.4g", y));
		keta(x);
		System.out.print(" ");
		keta(y);
		System.out.println();
	}}

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