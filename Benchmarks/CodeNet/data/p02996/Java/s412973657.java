import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[][] AB = new int[N][2];
		for(int i=0;i<N;i++) {
			AB[i][0]=sc.nextInt();
			AB[i][1]=sc.nextInt();
		}

		Arrays.sort(AB, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		long t=0;
		for(int i=0;i<N;i++) {
			t+=AB[i][0];
			if(t<=AB[i][1])continue;
			else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}


}