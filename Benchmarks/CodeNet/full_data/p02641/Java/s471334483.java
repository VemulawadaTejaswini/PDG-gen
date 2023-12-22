import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        Set noSet = new HashSet<Integer>();
        for (int i=1;i<=n;i++) {
            noSet.add(sc.nextInt());
        }

        for (int i=0;i<=100;i++) {
            if (!noSet.contains(x-i)) {
                System.out.println(x-i);
                return;
            }
            if (!noSet.contains(x+i)) {
                System.out.println(x+i);
                return;
            }
        }
    }
}
