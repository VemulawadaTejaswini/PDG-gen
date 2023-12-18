import java.util.*;
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for(long i = 1;i<=n;i++){
            ans *= i;
            ans %= 1000000007L;
        }
        System.out.println(ans);
    }
}
