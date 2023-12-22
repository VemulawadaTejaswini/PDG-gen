import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}

		int count = 0;
		boolean judge;
		for(int i = 2; i < N; i++){
			judge = true;
			for(int j = 2; j < i; j++){
				if(i % j == 0) judge = false;
			}
			if(judge) count++;
		}
		System.out.println(count);
	}
}