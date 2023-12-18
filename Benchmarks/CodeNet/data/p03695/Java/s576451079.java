import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ns[] = new int[n];
        for (int i = 0; i < n; i++) {
            ns[i] = sc.nextInt();
        }
        int counts[] = new int[9];
        for (int i = 0; i < n; i++) {
            int cr = ns[i];
            counts[cr / 400]++;
        }
        int min = 0, max = 0;
        for (int i = 0; i < 8; i++) {
            if (counts[i] != 0) {
                min++;
            }
        }
        max = min + counts[counts.length-1];
        max = max > 8 ? 8 : max;
        System.out.println(min + " " + max);
    }
}
