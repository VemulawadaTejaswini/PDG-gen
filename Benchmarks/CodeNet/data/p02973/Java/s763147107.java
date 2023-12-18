import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a_i = new long[n];
        for (int i = 0; i < n; i++) {
            a_i[i] = sc.nextLong();
        }
        ArrayList<Long> colors = new ArrayList<>();
        outer:for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < colors.size(); j++) {
                if(a_i[i] < colors.get(j)) {
                    colors.set(j, a_i[i]);
                    continue outer;
                }
            }
            colors.add(a_i[i]);
        }
        System.out.println(colors.size());
    }
}