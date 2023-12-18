import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]pre = new int[N];
        int ans = 0;

        for (int i = 0; i < N; i++) {
			pre[i] = sc.nextInt();
		}
        sc.close();
        Arrays.sort(pre);
        
        for (int i = 0; i < N; i++) {
			if(i != N-1) {
				ans += pre[i];
			}else {
				ans += pre[i]/2;
			}
			
		}
        System.out.println(ans);
    }
}