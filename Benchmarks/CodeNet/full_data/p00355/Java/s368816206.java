import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
        int result = 0;

        int[] s = new int[n], f = new int[n];
        for(int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            f[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if(a < f[i] && s[i] < b) {
                result++;
                break;
            }
        }
        System.out.println(result);
    }
}