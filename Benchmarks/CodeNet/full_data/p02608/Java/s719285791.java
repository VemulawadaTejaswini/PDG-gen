import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[10002];
        for (int x = 1 ; x <= 100 ; x++) {
            for (int y = 1 ; y <= 100 ; y++) {
                for (int z = 1 ; z <= 100 ; z++) {
                    if (x * x + y * y + z * z + x * y + y * z + z *x <= n) {
                        a[x * x + y * y + z * z + x * y + y * z + z *x]++;
                    }
                }
            }
        }
        for (int i = 1 ; i <= n ; i++) {
            System.out.println(a[i]);
        }
    }

}
