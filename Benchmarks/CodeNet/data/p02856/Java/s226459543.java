import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int m = sc.nextInt();
        sc.nextLine();
        long res = 0L;
        long sum = 0L;
        for (int i = 0; i < m; i++) {
            int di = sc.nextInt();
            long ci = sc.nextLong();
            res += ci*((long)di);
            sum += ci;
        }
        System.out.println((res-1)/9L + sum -1);
    }
}
