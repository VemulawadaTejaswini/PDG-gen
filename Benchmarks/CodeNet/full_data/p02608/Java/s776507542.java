import java.util.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            long count = 0;
            for (long a = 1; a < (int) Math.sqrt(i); a++) {
                for (long b = 1; b < (int) Math.sqrt(i); b++) {
                    long ans = i - a*a - b*b - a*b;
                    for (long c = (int)Math.sqrt(ans)-2; c < Math.sqrt(ans); c++) {
                        if (c < 1) {
                            continue;
                        }
                        if (ans == c*c + a*c +b*c) {
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