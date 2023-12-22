import java.util.Scanner;

public class Main {
static long[] nCrModp(int n, int r, long p) { 
        if (r > n - r) 
            r = n - r; 
  
        long C[] = new long[r + 1]; 
  
        C[0] = 1;  
        for (int i = 1; i <= n; i++) { 
   
            for (int j = Math.min(i, r); j > 0; j--) 
  
                C[j] = (C[j] + C[j - 1]) % p; 
        } 
        return C; 
    } 
    
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int add = scanner.nextInt();
		String temp = scanner.next();
		int length = temp.length();
		long mod = (long) (Math.pow(10, 9) + 7l);
		int amount = length + add;
		long[] powers = new long[amount + 1];
		powers[0] = 1l;
		for (int i = 0; i < powers.length - 1; i++) 
		    powers[i + 1] = powers[i] * 25 % mod;
		
		long[] combinations = nCrModp(amount, length, mod);
		long result = 1l;
		for(int i = 0; i < amount; i++) 
			result = result * 26 % mod;
		for(int i = 0; i < length; i++) {
			long temporal = powers[amount - i] * combinations[combinations.length - length + i - 1] % mod;
			result -= temporal;
			while(result < 0)
				result += mod;
			result %= mod;
		}
		System.out.print(result);
	}  
}