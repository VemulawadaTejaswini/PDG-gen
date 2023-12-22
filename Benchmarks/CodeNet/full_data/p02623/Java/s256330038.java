import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        for (int i = 0; i < m; i++) {
            b.add(scanner.nextInt());
        }

        ArrayList<Integer> ab = new ArrayList<>();
        ab.addAll(a);
        ab.addAll(b);
        Collections.sort(ab);

        for (Integer integer : ab) {
            if (k - integer < 0) {
                break;
            } else {
                count = count + 1;
                k = k - integer;
            }
        }

        System.out.println(count);
    }
}