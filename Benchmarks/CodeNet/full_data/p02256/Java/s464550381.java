import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.stream.Stream;

public class Main {

	  public static void main(String[] args) throws IOException {

		    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		    String[] strArr = in.readLine().split("\\s");
		    BigInteger[] bigIntArr = new BigInteger[strArr.length];
		    for (int index = 0; index < strArr.length; index++) {
		    	bigIntArr[index] = BigInteger.valueOf(Long.valueOf(strArr[index]));
		    }
		    // 実際の処理と結果
		    System.out.println(gcd(bigIntArr));
		  }

		  public static BigInteger gcd(BigInteger[] arr) {
		    return Stream.of(arr)
		    .reduce(BigInteger::gcd)
		    .orElse(BigInteger.ZERO);
		  }

}

