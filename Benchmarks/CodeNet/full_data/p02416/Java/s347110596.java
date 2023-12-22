import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import static java.math.BigInteger.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while(!"0".equals(str = br.readLine())){
			System.out.println(sum(str));
		}
	}

	private static int sum(String str) {
		BigInteger n = new BigInteger(str);
		if(n.compareTo(TEN) < 0){
			return Integer.parseInt(n.toString());
		}else{
			return Integer.parseInt(n.remainder(TEN).toString()) + sum(n.divide(TEN).toString());
		}
	}
}