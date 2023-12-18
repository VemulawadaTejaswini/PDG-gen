import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        Set<Integer> set = new HashSet<Integer>();

        for (int i = a; i < a + k && i <= b; i++) {
            set.add(i);
        }
        for (int i = b; i > b - k && i >= a; i--) {
            set.add(i);
        }

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}