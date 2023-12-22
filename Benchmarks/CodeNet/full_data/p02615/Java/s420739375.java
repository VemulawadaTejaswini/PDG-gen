import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] array = new long[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextLong();
		}
		sc.close();


		Arrays.sort(array);
		long ans = array[n-1];

		long tmp=1000000001L;
		long tmp1=array[n-1];
		long tmp2=array[n-2];
		for(int i = n-3;i!=-1;i--) {

			if(i!=n-1) {
				tmp=Math.min(tmp1, tmp2);
				ans = ans + tmp;
			}
			tmp2 = tmp1;
			tmp1 = array[i];
		}


		System.out.println(ans);
	}
}