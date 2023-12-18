import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		for(int i = 0;i < N;i++) {
			num[i] = sc.nextInt();
		}
		int max = 0;
		int tmp = 0;
		for(int j = 0;j < 1000000;j++) {
			for(int k = 0;k < N;k++) {
				tmp = j % num[k] + tmp;
			}
			if(tmp > max) {
				max = tmp;
			}
			tmp = 0;
		}
		System.out.println(max);
	}
}