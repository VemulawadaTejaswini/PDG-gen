import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];
		for(int i = 0 ; i < q ; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		// エラトステネスの篩で素数を調べる
		boolean[] isPrime = new boolean[100010];
		for(int i = 0 ; i < 100010 ; i++) isPrime[i] = true;
		isPrime[0] = isPrime[1] = false;
		for(int i = 2 ; i < 100010 ; i++) {
			if(isPrime[i]) {
				for(int j = i * 2 ; j < 100010 ; j += i) {
					isPrime[j] = false;
				}
			}
		}
		int[] imos = new int[100010];
		for(int i = 3 ; i < 100000 ; i++) {
			if(i % 2 == 1 && isPrime[i] && isPrime[(i + 1) / 2]) {
				imos[i]++;
				imos[100000]--;
			}
		}
		for(int i = 0 ; i < 100000 ; i++) imos[i + 1] += imos[i];
//		for(int i = 0 ; i < 70 ; i++) {
//			System.out.println(imos[i] + " " + i);
//		}
		for(int i = 0 ; i < q ; i++) {
			System.out.println(imos[r[i]] - imos[l[i] - 1]);
		}
	}

}
