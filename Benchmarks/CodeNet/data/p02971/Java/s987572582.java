import java.util.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int[] b = A.clone();
		Arrays.parallelSort(b);
		for(int i = 0 ; i< N; i++) {
			if(A[i] == b[N-1]) {
				System.out.println(b[N-2]);
				continue;
			}
			System.out.println(b[N-1]);
		}
		
		sc.close();
	}

}
