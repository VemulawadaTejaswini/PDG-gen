import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	static int N;
	static BigInteger A;
	static BigInteger B;
	public static void main(String[] args) throws NumberFormatException, IOException {
		read();
	}

	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		String[] word = br.readLine().split("\\s+");
		BigInteger res = BigInteger.ONE;
		for(int  i = 0;i<N;i++){
			res = res.multiply(BigInteger.valueOf(Long.valueOf(word[i])));
		}
		long max = (long) 1e18;
		if  ( res.compareTo(BigInteger.valueOf(max)) > 0){
			System.out.println(-1);
			br.close();
			return;
		}
		System.out.println(res.toString());
		br.close();
	}

}
