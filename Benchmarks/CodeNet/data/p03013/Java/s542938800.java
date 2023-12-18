import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		a[0] = sc.nextInt();
		for(int i=1;i<M;i++) {
			a[i] = sc.nextInt();
			if (a[i] - a[i-1] == 1) {
				System.out.println(0);
				return;
			}
		}

		long ans = 1;
		ans *= antotal(0,a[0]-1);
		for(int i=0;i<M-1;i++) {
			ans *= antotal(a[i]+1,a[i+1]-1);
		}
		ans *= antotal(a[M-1]+1,N);
		System.out.println(ans % 1000000007L);
	}

	public static long antotal(int start,int end) {
		int interval = end - start;

		int one_num = interval;
		int two_num = 0;
		long sum = 0;

		if(one_num == 1) return 1;
		while(one_num >= 0) {
			sum += fact(one_num + two_num)/(fact(one_num)*fact(two_num));
			System.out.println("1num:"+one_num+",2num:"+two_num+",sum:"+sum);
			one_num -= 2;
			two_num++;
		}
		System.out.println(start+" "+end+" "+sum);
		return sum;
	}

	public static long fact(int i) {
		if(i <= 1) return 1;
		else return i*fact(i-1);
	}
}