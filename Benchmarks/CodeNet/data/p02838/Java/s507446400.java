import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Long> list = new ArrayList<Long>();
		for(int i=0; i<n; i++) {
			list.add(in.nextLong());
		}
		int mod = (int) (Math.pow(10, 9)+7);
		int sum = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				sum += (list.get(i) ^ list.get(j)) % mod;
				sum %= mod;
			}
		}
		sum %= mod;
		System.out.println(sum);
	}

}