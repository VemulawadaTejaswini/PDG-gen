import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] l = new long[n + 1];
        l[0] = 2;
        l[1] = 1;
        for (int i = 0 ; i <= n ; i++) {
            if (i >= 2) l[i] = l[i - 1] + l[i -2];
        }
        System.out.println(l[n]);
    }

}