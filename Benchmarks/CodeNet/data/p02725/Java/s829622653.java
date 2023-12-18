
import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N];
        int first = sc.nextInt();
        for (int i = 1; i < N; i++) {
            int cur = sc.nextInt();
            arr[i-1] = cur - first;
            if (i == N-1) arr[i] = K - cur;
        }


        int sum = 0;
        for (int i = 0; i < N-1; i++) {
            sum += arr[i];
        }
        
        int ans = sum;
        for (int i = 1; i < N; i++) {
            sum -= arr[i-1];
            sum += arr[(N-2+i)%N];
            ans = Math.min(ans, sum);
        }

        System.out.println(ans);

        sc.close();
	}
}