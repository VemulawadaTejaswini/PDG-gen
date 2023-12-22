import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Main {
	public void exec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
    	int n = Integer.parseInt(br.readLine());
    	int[] x = parseInts(br.readLine().split(" "));
    	int[] y = parseInts(br.readLine().split(" "));
    	long sum1 = 0,sum2 = 0,sum3 = 0;
    	int max=0;
		for(int i=0; i<n; i++) {
			int d = Math.abs(x[i]-y[i]);
			int d2 = d*d;
			sum1 += d;
			sum2 += d2;
			sum3 += d*d2;
			max = Math.max(d, max);
		}
    	out.printf("%.5f\n",(double)sum1);
    	out.printf("%.5f\n",Math.sqrt(sum2));
    	out.printf("%.5f\n",Math.cbrt(sum3));
    	out.printf("%.5f\n",(double)max);
        out.flush();
    }
	
	private int[] parseInts(String[] s) {
		int[] v = new int[s.length];
		for(int i=0; i<s.length; i++) {
			v[i] = Integer.parseInt(s[i]);
		}
		return v;
	}
	
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}