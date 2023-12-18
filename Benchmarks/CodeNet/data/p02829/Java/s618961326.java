
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        Set<Integer> ans = new HashSet<>();
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.remove(A);
        ans.remove(B);
        System.out.println(ans.toArray()[0]);
    }
}
