import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long K = sc.nextLong();
		long num = 1;
		long max = 0;
		for(long cnt=0;cnt<K;) {
			if(max < sumDegit(num)) {
				System.out.println(num);
				max = sumDegit(num);
				cnt++;
			}
			num++;
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
}
