import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	double ep = 0.00000001;
	while(s.hasNext()) {
	    double[] d = new double[8];
	    Double ab,cd;
	    for(int i=0 ; i<8 ; i++)
		d[i] = s.nextDouble();
	    if((d[2]-d[0]) != 0)
		ab = (d[3]-d[1])/(d[2]-d[0]);
	    else
		ab = Double.NaN;

	    if((d[6]-d[4]) != 0)
	       cd = (d[7]-d[5])/(d[6]-d[4]);
	    else
		cd = Double.NaN;
	    String ans;
	    if ((ab == 0 && cd.isNaN()) || (ab.isNaN() && cd == 0)) {
		ans = "YES";
	    } else {
		if ((ab*cd + 1.0) < ep)
		    ans = "YES";
		else
		    ans = "NO";
	    }
	    System.out.println(ans);
	}
    }
}