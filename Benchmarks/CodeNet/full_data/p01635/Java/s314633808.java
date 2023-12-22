import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}
class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	void solve(){
		int n = in.nextInt(), t = in.nextInt();
		String str = in.next();
		String[] s = str.split("\\+", 0);
		String ns = Integer.toString(n);
		String ts = Integer.toString(t);
		BigInteger bi = new BigInteger("0");
		for(int i = 0; i < s.length; i++){
			String tmp = s[i].substring(2);
			BigInteger b = new BigInteger(ns);
			//System.out.println(b.pow(Integer.valueOf(tmp)).toString());
			bi = bi.add(b.pow(Integer.valueOf(tmp)));
			//System.out.println(bi.toString());
		}
		bi = bi.multiply(new BigInteger(ts));
		BigInteger tle = new BigInteger("1000000000");
		if(bi.compareTo(tle) == 1){
			System.out.println("TLE");
		}
		else{
			System.out.println(bi.toString());
		}
	}


	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }