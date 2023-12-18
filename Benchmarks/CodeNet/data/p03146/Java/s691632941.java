import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(s);
        int n = function(s);
        
        for (int i = 1; !list.contains(n); i++) {
            list.add(n);
            n = function(n);
        }
        System.out.println(list.size() + 1);
    }

    private static int function(int n) {
        if (n % 2 == 0) return n / 2;
        else return 3 * n + 1;
    }
}