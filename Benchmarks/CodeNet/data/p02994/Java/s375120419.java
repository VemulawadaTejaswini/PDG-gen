import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int min = Math.abs(l);
        int k = 1;
        int sum = l;
        for (int i = 2; i <= n; i++) {
            if (min > Math.abs(l - 1 + i)) {
                min = Math.abs(l - 1 + i);
                k = i;
            }
            sum += l + i - 1;
        }
        System.out.println(sum - (l + k - 1));
        sc.close();
    }
}