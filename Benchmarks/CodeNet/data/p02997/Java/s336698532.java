import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = (n - 1) * (n - 2) / 2;
        if (k > max) { 
            System.out.println(-1);
            return;
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            sb.append(1).append(" ").append(i).append("\n");
            count++;
        }
        for (int i = 2; i <= n - 1 && k < max; i++) {
            for (int j = i + 1; j <= n && k < max; j++) {
                sb.append(i).append(" ").append(j).append("\n");
                count++;
                max--;
            }
        }
        System.out.println(count);
        System.out.print(sb);
   }
}