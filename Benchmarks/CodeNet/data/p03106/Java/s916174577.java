import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        ArrayList<Integer> commonDivisor = new ArrayList<>();
        for (int i = 1; i <= Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                commonDivisor.add(i);
            }
        }

        Collections.sort(commonDivisor);
        System.out.println(commonDivisor.get(commonDivisor.size() - k));
    }
}