import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	int ns = scan.nextInt();
	int amount = scan.nextInt();
	int t, f, o, flag;
	t = f = o = flag = -1;
	for(int ot = 0; ot <= ns; ot++) {
	    for(int ft = 0; ft <= ns - ot; ft++) {
	    	for(int tt = 0; tt <= ns - (ft + ot); tt++) {
		    if(tt*1000 + ft*5000 + ot*10000 == amount) {
			t = tt; f = ft; o = ot;
			flag = 0;
			break;
		    }
		}
		if(flag == 0) break;
	    }
	    if(flag == 0) break;
	}
	System.out.println(o + " " + f + " " + t);
    }
}