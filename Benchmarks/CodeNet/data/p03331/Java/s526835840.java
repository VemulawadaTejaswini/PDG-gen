import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 10 == 0) {
            n /= 2;
        }
        char[] nn = Integer.toString(n).toCharArray();
        int ans = 0;
        for (int i = 0; i < nn.length; i++) {
            int tmp = Integer.parseInt(Character.toString(nn[i]));
            ans += tmp;
        }if(n % 10 == 0) {
            ans *= 2;
        }
        System.out.println(ans);
    }
}