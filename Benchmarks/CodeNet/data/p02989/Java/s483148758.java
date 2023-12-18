import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] d = new int[N];
		for(int i = 0; i < N; i++) {
			d[i] = sc.nextInt();
		}
		sc.close();
		
		bubbleSort(N , d);
		int beforeMax = d[N / 2];
		int afterMin = d[N / 2 + 1];
		System.out.println(afterMin - beforeMax);
		
	}
	
	public static void bubbleSort(int a, int[] S) {
		for(int i = a - 1; i > 1; i--) {
			boolean flag = true;
			while(flag) {
				flag = false;
				for(int j = a -1; j > 1; j--) {
					int key = S[j];
					if(S[j - 1] > key) {
						S[j] = S[j-1];
						S[j-1] = key;
						flag = true;
					}
				}
			}
		}
	}
}
