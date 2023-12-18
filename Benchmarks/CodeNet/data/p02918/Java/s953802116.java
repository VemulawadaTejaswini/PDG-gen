import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        char[] s = sc.next().toCharArray();
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        int count = 0;
        for (int i = 0 ; i < n - 1 ; i++) {
            if (s[i] != s[i + 1]) count++;
        }
        if (k >= (count + 1 )/ 2) {
            System.out.println(n - 1);
            return;
        }

        count -= 2 * k;

        System.out.println(n - (count + 1));

     }

}
