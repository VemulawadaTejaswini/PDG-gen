import java.io.*;

public class Main1{
	public static void main(String[] arsg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = new String[4];
		str = br.readLine().split(" ");
		
		double x1 = Double.parseDouble(str[0]);
		double y1 = Double.parseDouble(str[1]);
		double x2 = Double.parseDouble(str[2]);
		double y2 = Double.parseDouble(str[3]);
		
		System.out.println(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
	}
} 