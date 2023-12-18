import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		long[] keta1 = new long[11000];
		long[] keta2 = new long[11000];
		
		long a = A;
		int x = 0;	
		while(a > 1) {
			keta1[x] += a % 2;
			keta2[x] = keta1[x];
			a /= 2;
			x++;
		} 
		keta1[x] += a;
		keta2[x] = keta1[x];
		
		for(long j = A + 1; j <= B; j++) {
			for(int i = 0; i < keta2.length; i++) {
				if(i == 0) {
					if(keta2[i] + 1 == 2) {
						keta2[i] = 0;
						keta2[i + 1]++;
					} else {
						keta2[i]++;
						break;
					}
				} else {
					if(keta2[i] == 2) {
						keta2[i] = 0;
						keta2[i + 1]++;
					} else {
						break;
					}
				}
			}
			
			for(int i = 0; i < keta1.length; i++) {
				keta1[i] += keta2[i];
			}
		}
		
		long ans = 0;
		
		for(int i = 0; i < 10000; i++) {
			keta1[i] = keta1[i] % 2;
			ans += keta1[i] * (long)Math.pow(2, i);
		}
		System.out.println(ans);
	}
}
