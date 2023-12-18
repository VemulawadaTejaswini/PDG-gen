import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		Integer n = Integer.parseInt(temp[0]);
		Integer a = Integer.parseInt(temp[1]);
		Integer b = Integer.parseInt(temp[2]);
		int p,sum,res = 0;
		for(int i=1;i<=n; i++) {
			p = i;
			sum = 0;
			while(p > 0) {
				sum += p % 10;
				p /= 10;
			}
			if(a <= sum && b >= sum) res += i;
		}
		System.out.println(res);
	}
}