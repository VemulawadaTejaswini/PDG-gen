import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = readInt(r);
		int[] price = new int[n];
		for(int i = 0 ; i < n ; i++) price[i] = readInt(r);

		int max = -2000000000;
		int min = price[0];
		for(int x = 1 ; x < n ; x++){
			max = Math.max(max,price[x] - min);
			min = Math.min(min,price[x]);
		}

		System.out.println(max);
	}

	public static int readInt(BufferedReader r) throws Exception{
		return Integer.parseInt(r.readLine());
	}

}