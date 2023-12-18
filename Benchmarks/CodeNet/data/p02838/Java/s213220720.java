import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long[] data = new Long[n];
		for (int i=0 ; i<n ; i++) data[i] = sc.nextLong();
		sc.close();
		Long modValue = 1000_000_007L;
		Long total = 0L ;
		for (int i=0 ; i<n ; i++) {
			Long sum = 0L;
			for (int j=i+1 ; j<n ; j++) {
				Long x = data[i] ^ data[j];
				sum += x;
				sum %= modValue;
			}
			total += sum;
			total %= modValue;
		}
		System.out.println(total);
	}
}