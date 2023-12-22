import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		long ret = 0;
		BigInteger modThing = new BigInteger("" + ((int) Math.pow(10, 9) + 7));
		BigInteger prev = (new BigInteger("" + arr[arr.length - 2])).multiply(new BigInteger("" + arr[arr.length - 1]));
		ret += prev.mod(modThing).intValue();
		ret %= Math.pow(10, 9) + 7;
		for (int i = arr.length - 3; i >= 0; i--) {
			BigInteger single = (new BigInteger("" + arr[i])).multiply(new BigInteger("" + arr[i + 1]));
			BigInteger newOne = prev.multiply(new BigInteger("" + arr[i])).divide(new BigInteger("" + arr[i + 1]));
			prev = single.add(newOne);
			ret += prev.mod(modThing).intValue();
			ret %= Math.pow(10, 9) + 7;
		}
		
		System.out.println(ret);
		reader.close();
	}
	
}
