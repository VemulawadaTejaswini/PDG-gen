import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int d[]=new int[N];
		for(int i=0;i<N;i++) {
			d[i]=sc.nextInt();
		}
		Arrays.sort(d);

		System.out.println(d[N/2]-d[N/2-1]);


	}
}