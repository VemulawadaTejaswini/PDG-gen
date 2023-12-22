import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x = sc.nextLong();
		long m = sc.nextLong();
		sc.close();

		long ans = x;
		long tmp = x;

		if(n==1) {
			System.out.println(ans);
			return;
		}

		tmp = (tmp*tmp)%m;
		ans = ans + tmp;

		if(n==2) {
			System.out.println(ans);
			return;
		}

		tmp = (tmp*tmp)%m;
		ans = ans + tmp;

		if(n==3) {
			System.out.println(ans);
			return;
		}

		long rep = tmp;
		long tmpAns = 0L;
		long count = 0L;
		boolean flag = false;
		long[] array = new long[10000000];
		for(long i=3L;i<n;i++) {
			tmp = (tmp*tmp)%m;
			count++;
			tmpAns = tmpAns + tmp;
			array[(int) count] = tmpAns;
			if(rep==tmp) {
				flag = true;
				break;
			}
		}
		rep = n/count;
		if(flag) {
			ans = ans + (rep)*tmpAns;
			if(n-count*rep-3>0) {
				ans = ans + array[(int) (n-count*rep-3L)];
			}
		} else {
			ans = ans + tmpAns;
		}
		System.out.println(ans);
	}
}
