public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= K; i ++) {
			for(int j = 1; j <= K; j ++) {
				for(int k = 1; k <= K; k ++) {
					sum += gcd(gcd(i, j), k);
				}
			}
		}
		System.out.println(sum);
	}
	
	public static int gcd(int a, int b) {
		int ret = 0;
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int amari = 0;
		while(true) {
			amari = max % min;
			if(amari == 0) {
				ret = min;
				break;
			}
			max = min;
			min = amari;
		}
		return ret;
	}
}