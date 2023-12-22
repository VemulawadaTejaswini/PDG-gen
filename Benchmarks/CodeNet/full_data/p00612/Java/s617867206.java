import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			BigInteger N = sc.nextBigInteger();
			if(N.equals(BigInteger.ZERO)){ break; }
			// 2N^2+8N = (N + 4) * N * 2
			BigInteger answer = N.add(new BigInteger("4")).multiply(N);
			answer = answer.add(answer);
			if(N.compareTo(new BigInteger("4")) < 0){
				// nothing to do
			}else if(N.compareTo(new BigInteger("8")) < 0){
				// answer -= (N - 4)^2 * 2
				BigInteger t = N.add(new BigInteger("-4")).pow(2).negate();
				answer = answer.add(t).add(t);
			}else{
				// answer -= (N - 4)^2 * 2
				BigInteger t = N.add(new BigInteger("-4")).pow(2).negate();
				answer = answer.add(t).add(t);
				// t = (N - 7) / 2
				t = N.add(new BigInteger("-7")).divide(new BigInteger("2"));
				// answer += t * (t + 1) * 4
				t = t.add(BigInteger.ONE).multiply(t).multiply(new BigInteger("4"));
				answer = answer.add(t);
			}
			System.out.println(answer);
		}
	}
}