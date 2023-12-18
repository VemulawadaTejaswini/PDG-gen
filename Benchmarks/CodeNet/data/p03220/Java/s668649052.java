import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();

        int[] h = new int[n];
        for(int i = 0; i < n; i++) {
        	h[i] = scan.nextInt();
        }

        int ans = 0;
        int temp = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
        	if(a - ((t - h[i]) * 6 / 1000) < temp) {
        		temp = a - ((t - h[i]) * 6 / 1000);
        		ans = i + 1;
        	}
        }

        System.out.println(ans);
    }
}
