import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 19
public class Main {
    static int func(int n) {
        if(n % 2 == 0) return n / 2;
        return 3 * n + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Integer> set = new HashSet<Integer>();
        int i = 1;
        while(true) {
            set.add(n);
            n = func(n);
            if(set.contains(n))
                break;
            ++i;
        }

        System.out.println(i + 1);
    }

}
