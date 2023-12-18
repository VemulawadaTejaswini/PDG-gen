import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ks = scanner.nextLine().split(" ", 2);
        int k = Integer.parseInt(ks[0]);
        int s = Integer.parseInt(ks[1]);

        int count = 0;
        for (int x = 0; x <= Math.min(k, s); x++) {
            for (int y = 0; y <= Math.min(k, s - y); y++) {
                if (x + y <= s && s <= x + y + k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
