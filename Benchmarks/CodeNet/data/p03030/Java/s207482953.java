import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] p = new String[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.next();
            int price = sc.nextInt();
            p[i] = p[i] + "," + (1000 - price) + "," + (i + 1);
        }
        Arrays.sort(p);

        for (String s : p) {
            System.out.println(s.split(",")[2]);
        }
    }
}