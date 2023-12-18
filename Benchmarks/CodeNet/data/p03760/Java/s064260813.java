import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC_058_B {
	public static void main(String[] args) throws IOException {
		BufferedReader oi = new BufferedReader(new InputStreamReader(System.in));
		String[] odd = oi.readLine().split("");
		String[] even = oi.readLine().split("");

		int od = odd.length;
		int ev = even.length;
		String a=odd[0];
		for(int i=1; i < od + ev; i++) {
			if(i%2==1) a = a + odd[i/2];
			else a = a + even[i/2];
		}
		System.out.println(a);
	}
}
