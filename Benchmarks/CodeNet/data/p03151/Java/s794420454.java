
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		int n = Integer.parseInt(str);
		String strA = input.readLine( );
		String strB = input.readLine( );
		String[] arrayStrA = strA.split(" ");
		String[] arrayStrB = strB.split(" ");

		BigInteger[] arrayA = new BigInteger[n];
		BigInteger[] arrayB = new BigInteger[n];
		BigInteger[] diff = new BigInteger[n];
		BigInteger sum = new BigInteger("0");
		BigInteger zero = new BigInteger("0");

		for(int i=0; i<n; i++) {
			arrayA[i] = new BigInteger(arrayStrA[i]);
			arrayB[i] = new BigInteger(arrayStrB[i]);
			diff[i] = arrayA[i].subtract(arrayB[i]);
			sum = sum.add(diff[i]);
		}

		int left = 0;
		int right = 1;

		if(sum.compareTo(zero) < 0) {
			System.out.println(-1);
		}else {
			Arrays.sort(diff);
			if(diff[0].compareTo(zero) == 0) {
				System.out.println(0);
			}else {

			while(diff[left].compareTo(zero) < 0) {
				if((diff[left].add(diff[n-right])).compareTo(zero) >=0) {
					diff[n-right] = diff[n-right].add(diff[left]);
					diff[left] = zero;
					left++;
				}else {
					diff[0] = diff[0].add(diff[n-1]);
					diff[n-1] = zero;
					right++;
				}
			}
			System.out.println(left+right);
			}
		}
	}

}
