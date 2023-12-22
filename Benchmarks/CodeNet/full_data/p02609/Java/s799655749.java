import java.util.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            long count = 0;
            for (long a = 1; a < 100; a++) {
                for (long b = 1; b < 100; b++) {
                    for (long c = 1; c < 100; c++) {
                        if (i == a*a + b*b + c*c + a*b + b*c + a*c) {
                            count++;
                        }
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}