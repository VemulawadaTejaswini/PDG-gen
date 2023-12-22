import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main (String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = in.readLine().split(" ");
        double a = Double.parseDouble(tmp[0]);
        double b = Double.parseDouble(tmp[1]);
        double C = Math.PI * Double.parseDouble(tmp[2]) / 180.0 ;
        
        double h = b * Math.sin(C);
        double S = 0.5 * a * h;
        double c = Math.sqrt(a*a+b*b-2*a*b*Math.cos(C));
        double L = a + b + c;
        
        System.out.printf("%.5f\n", S);
        System.out.printf("%.5f\n", L);
        System.out.printf("%.5f\n", h);
	}
}