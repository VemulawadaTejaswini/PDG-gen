import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long K = sc.nextLong();
		long num = 1;
		long max = 0;
		for(long cnt=0;cnt<K;cnt++) {
			System.out.println(num);
			num += plusNum(num);
		}
	}
	static int sumDegit(long N) {
		int i = 0;
		long tmp = N;
		while(tmp>=10) {
			i += tmp % 10;
			tmp = tmp / 10;
		}
		i += tmp;
		return i;
	}
	static long plusNum(long num) {
		long tmp = 0;
		num++;
		while(num/10>0) {
			tmp++;
			num /= 10;
		}
		long ans = 1;
		for(int i=0;i<tmp;i++) {
			ans *= 10;
		}
		return ans;
	}
}
