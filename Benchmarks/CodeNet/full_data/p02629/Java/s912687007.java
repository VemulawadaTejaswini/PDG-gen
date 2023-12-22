import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var n = sc.nextBigInteger();
		var output = "";
		for(;n.compareTo(BigInteger.valueOf(26))>0;) {
			var mod = n.mod(BigInteger.valueOf(26));
			output = Character.toString(mod.intValue() + 'a' - 1) + output;
			n = n.divide(BigInteger.valueOf(26));
		}
		output = Character.toString(n.intValue() + 'a' - 1) + output;

		System.out.println(output);
	}
}