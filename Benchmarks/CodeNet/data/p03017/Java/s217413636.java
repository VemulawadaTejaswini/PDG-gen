import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int length = scanner.nextInt();
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final int d = scanner.nextInt();

        scanner.nextLine();
        final char[] road = scanner.nextLine().toCharArray();

        if (d > c) {
            if (check(road, a, c) && check(road, b, d)) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        } else {
            boolean ok = false;
            for (int i = b; i < d; i++) {
                if(road[i-1] == '#'){
                    continue;
                }

                if (check(road, a, i - 1) && check(road, i + 1, c)) {
                    ok = true;
                    break;
                }
            }

            if (!ok) {
                System.out.println("No");
                return;
            }

            if(check(road,b,d)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    private static boolean check(char[] roads, final int begin, final int end) {
        if (roads[begin - 1] == '#' || roads[end - 1] == '#') return false;
        for (int i = begin; i < end; i++) {
            if (roads[i] == '#' && roads[i - 1] == '#') {
                return false;
            }
        }

        return true;
    }
}
