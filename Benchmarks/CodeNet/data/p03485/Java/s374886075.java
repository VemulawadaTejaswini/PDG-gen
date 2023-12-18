import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
	   
	public static void main(String[] args) throws IOException {
		 // TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String lin= br.readLine();
			String[] A = lin.split(" ");
			double a = Double.parseDouble(A[0]);
			double b = Double.parseDouble(A[1]);
			double sum=a+b;
			double x = sum/2;
			long y=Math.round(x);
			System.out.println(y);
	}
}
