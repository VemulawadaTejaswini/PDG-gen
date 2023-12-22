import java.util.Scanner;
import java.math.BigInteger;

class Main{
    static final BigInteger mod = BigInteger.valueOf(4294967311L);
    static BigInteger mypow(BigInteger n,BigInteger p){
	if (p.compareTo(BigInteger.ONE) == 0)return n;
	BigInteger ret = mypow(n,p.divide(BigInteger.valueOf(2)));
	ret = ret.multiply(ret).mod(mod);
	if (p.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ONE) == 0)ret = ret.multiply(n).mod(mod);
	return ret;
    }
    static BigInteger getinv(BigInteger a){
	return mypow(a,mod.subtract(BigInteger.valueOf(2)));
    }
    static BigInteger solve(int n,int op[],int val[]){
	BigInteger ret=BigInteger.ZERO;
	for(int i=0;i<n;i++){
	    BigInteger tval = BigInteger.valueOf(val[i]);
	    if (op[i] == 1){//+
		ret = ret.add(tval).mod(mod);
	    }else if (op[i] == 2){//-
		ret = ret.subtract(tval).mod(mod);
	    }else if (op[i] == 3){//*
		ret = ret.multiply(tval).mod(mod);
	    }else if (op[i] == 4){///
		BigInteger inv = getinv(tval);
		ret = ret.multiply(inv).mod(mod);
	    }
	}
	return ret;
    }
    public static void main(String[] args){
	BigInteger maxi = BigInteger.valueOf(2147483648L);
	int n;
	Scanner in = new Scanner(System.in);
	while(true){
	    if (in.hasNextInt());
	    else break;
	    n = in.nextInt();
	    if (n == 0)break;
	    int op[] = new int[n],val[] = new int[n];
	    for(int i=0;i<n;i++){
		op[i] = in.nextInt();
		val[i] = in.nextInt();
	    }
	    BigInteger ret = solve(n,op,val);
	    if (ret.compareTo(maxi) == -1){
	    }else {
		ret = ret.subtract(mod);
	    }
	    System.out.println(ret);
	}
    }
}