import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int num = s.charAt(i) * 100 + s.charAt(j) * 10 + s.charAt(k);
                    set.add(num);
                }
            }
        }

        System.out.println(set.size());

        sc.close();
    }

}
