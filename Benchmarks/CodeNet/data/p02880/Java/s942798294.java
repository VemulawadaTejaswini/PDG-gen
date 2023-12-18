import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                set.add(i*j);
            }
        }

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(set.contains(n)?"Yes":"No");
    }
}
