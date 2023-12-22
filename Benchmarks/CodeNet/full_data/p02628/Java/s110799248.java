import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = 0;
        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(scanner.nextInt());
        }
        Collections.sort(p);
        for (int i = 0; i < k; i++) {
            result = p.get(i) + result;
        }
        System.out.println(result);
    }
}