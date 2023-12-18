import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			String[] arrayA = br.readLine().split(" ");
			long sum = 0;
			for(int i = 0; i < n - 1; i++) {
				for(int j = i + 1; j < n; j++) {
					sum += getLCM(Integer.parseInt(arrayA[i]), 
					Integer.parseInt(arrayA[j]));
				}
			}
			System.out.println(sum % 998244353);
			br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static long getLCM(int a, int b) {
		long ele1 = Math.min(a, b);
		long ele2 = Math.max(a, b);
		if(ele2 % ele1 == 0) {
			return ele2;
		}
		long ulimit = (long)Math.sqrt(ele1);
		long i = 2;
		long pripro = 1;
		while(i <= ulimit) {
			if(ele1 % i == 0 && ele2 % i == 0) {
				pripro *= i;
				ele1 /= i;
				ele2 /= i;
			} else {
				i++;
			}
		}
		return ele1 * ele2 * pripro;
	}
}
