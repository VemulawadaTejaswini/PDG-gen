import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = sc.nextInt();
        int ans = Integer.MIN_VALUE;
        
        for (int i = 0; i < n - 1; i++) {
            int input = sc.nextInt();
            ans = Math.max(input - min, ans);
            min = Math.min(input, min);
        }
        System.out.println(ans);
    }
}
