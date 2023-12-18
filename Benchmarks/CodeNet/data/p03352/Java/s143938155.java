import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int lastPow = 1;
        for (int i = 1; i <= x; i++) {
            if (i * i <= x) {
                lastPow = i * i;
            }
        }
        System.out.println(lastPow);
    }
}
