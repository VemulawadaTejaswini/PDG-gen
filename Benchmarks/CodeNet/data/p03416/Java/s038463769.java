import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = solve(A, B);
        System.out.println(ans);
    }

    private static int solve(int A, int B) {
        int count = 0;

        for (int i=A; i<=B; i++) {
            if(isPalindrome(i)) count++;
        }

        return count;
    }

    private static boolean isPalindrome(int N) {
        if (N/10000 == N%10 && (N/1000)%10 == (N/10)%10) return true;
        
        return false;
    }
}