import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int a[] = new int[N];
		for(int i=0;i<N;i++) {
			int temp = sc.nextInt();
			a[temp-1]++;
		}
		int count=0;
		for (int i=0;i<N;i++) {
			if (a[i]>0) {
				count++;
			}
		}
		if (count<=K) {
			System.out.println(0);
			return ;
		}
		Arrays.sort(a);
		int i=0;
		for (;i<N;i++) {
			if (a[i]!=0) {
				break;
			}
		}
		int result=0;
		for (int j=0;j<count-K;j++) {
			result+=a[j+i];
		}
		System.out.println(result);
	}
}
