import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double x = 1;
		double h = 1;
		while(x!=0&&h!=0){
			x = Double.parseDouble(br.readLine());
			h = Double.parseDouble(br.readLine());
			double h2 = Math.sqrt((x/2)*(x/2)+h*h);
			System.out.println((x!=0)?x*x+ (h2*x)*2:"");
		}
	}
}