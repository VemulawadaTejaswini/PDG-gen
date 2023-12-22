import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	try {
	    int n = Integer.parseInt(br.readLine());
	    for (int i=0;i<n;i++) {
		Double x[] = new Double[4];
		Double y[] = new Double[4];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int j=0;j<4;j++) {
		    x[j] = Double.parseDouble(st.nextToken());
		    y[j] = Double.parseDouble(st.nextToken());
		}
		Double vx[] = new Double[2];
		Double vy[] = new Double[2];
		vx[0] = x[1]-x[0];
		vx[1] = x[3]-x[2];
		vy[0] = y[1]-y[0];
		vy[1] = y[3]-y[2];
		if (mul(vx[0],vy[0],vx[1],vy[1]).compareTo(0.000)==0) System.out.println("YES");
		else System.out.println("NO");
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public static Double mul(Double x1,Double y1,Double x2,Double y2) {
        return x1*y2-x2*y1;
    }
}