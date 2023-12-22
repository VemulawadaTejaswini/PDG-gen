import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String [] args){
	Scanner in = new Scanner(System.in);

	int n = in.nextInt();
	int [] o = new int [n];
	int [] y = new int [n];

	for(int i = 0; i < n; ++i){
	    o[i] = in.nextInt();
	    y[i] = in.nextInt();
	}

	double x = 0;

	for(int i = 0; i < n; ++i){
	    int oo = o[i];
	    int yy = y[i];
	    if(oo == 1){ // +
		x += yy;
	    }else if(oo == 2){ // -
		x -= yy;
	    }else if(oo == 3){ // *
		x *= yy;
	    }else if(oo == 4){
		x /= yy;
	    }
	}

	int ans = 0;
	if(x > 0) ans = (int)(x + 0.0000000001);
	else      ans = (int)(x - 0.0000000001);

	if(Math.abs((double)ans - x) < 0.00001){
	    System.out.println("" + ans);
	}else{
	    BigInteger ue   = BigInteger.ZERO;
	    BigInteger sita = BigInteger.ONE;
	    int cnt = 0;

	    for(int i = 0; i < n; ++i){
		int oo = o[i];
		BigInteger yy = new BigInteger(String.valueOf(y[i]));

		if(oo == 1){ // +
		    ue = ue.add(sita.multiply(yy));
		}else if(oo == 2){ // -
		    ue = ue.subtract(sita.multiply(yy));
		}else if(oo == 3){ // *
		    ue   = ue.multiply(yy);
		    ++cnt;
		}else if(oo == 4){
		    sita = sita.multiply(yy);
		    --cnt;
		}

		if(Math.abs(cnt) > 5 || i == n - 1){
		    BigInteger gcd = ue.gcd(sita);
		    ue   = ue.divide(gcd);
		    sita = sita.divide(gcd);
		    cnt = 0;
		}
	    }
	    System.out.println("" + ue);
	}
    }
}