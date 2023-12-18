import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] buff = new int[N];
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		buff = a.clone();
		Arrays.sort(buff);
		int max = buff[N-1];
		int sMax=max;
		for(int i=N-2;i>=0;i--) {
			if(buff[i]!=max) {
				sMax = buff[i];
				break;
			}
		}

		for(int i=0;i<N;i++) {
			//System.out.print(a[i]);
			if(a[i] == max) {
				System.out.println(sMax);
			}else {
				System.out.println(max);
			}
		}


	}
}