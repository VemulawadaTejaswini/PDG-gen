import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
 
		try {
			int c = 0;
			int sumcost = 0;
			double sumn = 0;
			while ((buf = br.readLine())!=null) {
				c++;
				StringTokenizer st = new StringTokenizer(buf,",");
				int cost = Integer.parseInt(st.nextToken());
				int n = Integer.parseInt(st.nextToken());
				sumcost += cost*n;
				sumn += (double)n;
			}
			System.out.println(sumcost);
			System.out.println(Math.round(sumn/(double)c));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}