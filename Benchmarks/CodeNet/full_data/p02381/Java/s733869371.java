import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
 
public class Main {
	public void exec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        while(true) {
        	int n = Integer.parseInt(br.readLine());
        	if(n==0) break;
        	double[] s = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        	double m = Arrays.stream(s).average().getAsDouble();
        	out.printf("%.4f\n",Math.sqrt(Arrays.stream(s).map(si -> Math.pow(si-m,2)).sum()/n));
        }
        out.flush();
    }
  
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}