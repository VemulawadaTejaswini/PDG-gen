import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		int kosu = N+M;
		int[] atai = new int[kosu];

		int wa=0;
		int goukei=0;

		for(int i=0;i<kosu;i++) {
			atai[i] = sc.nextInt();
		}
		Arrays.sort(atai);
		for(int i=kosu;i<0;i--) {
			if(wa<=K) {
				wa = wa+atai[kosu-1];
				goukei++;
			}
		}

		System.out.println(wa);
		sc.close();

	}

}