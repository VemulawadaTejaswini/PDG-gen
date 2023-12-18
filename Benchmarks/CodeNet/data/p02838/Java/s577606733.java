import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
        long[] numbers = new long[n+1];
        for (int i=1; i<=n; i++) {
          numbers[i] = sc.nextLong();
        }
        
        long total = 0;
        for (int i=1; i<n; i++) {
          for (int j=i+1; j<=n; j++) {
            total += numbers[i] ^ numbers[j];
          }
        }
		
        while (total < 0) {
          total += 1000000007;
        }
		System.out.println(total % 1000000007);
    }
}


