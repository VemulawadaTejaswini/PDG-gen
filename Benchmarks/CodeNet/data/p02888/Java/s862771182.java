import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] L = new int[N];

		for (int i=0; i < N; i++){
			L[i] = sc.nextInt();
		}

		int ans=0;
		for (int i=0; i < N - 2; i++){
			for (int j=i+1; j < N-1; j++){
				for (int k=j+1; k < N; k++){
					if (judge(L[i], L[j], L[k])){
						ans ++;
					}
				}
			}
		}
		System.out.println(ans);
	}

	public static boolean judge(int a, int b, int c){
		if ((a < b + c) && (b < c +a) && (c < a + b)){
			return true;
		} else {
			return false;
		}
	}
}