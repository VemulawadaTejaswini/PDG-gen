import java.math.BigInteger;
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger input = new BigInteger(sc.next());
		BigInteger neck = new BigInteger(sc.next());
		for(int i = 0; i < 4; i++) {
			neck = neck.min(new BigInteger(sc.next()));
		}
		BigInteger ans;
		if(neck.compareTo(input) == -1) {
			ans = input.add(neck).subtract(BigInteger.ONE).divide(neck).add(new BigInteger("4"));
		}else {
			ans = new BigInteger("5");
		}
		System.out.println(ans.toString());
	}
}


