import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> commonDivisors = new ArrayList<>();

        for (int i = 1; i < 1000000000; i++) {
            if (A % i == 0 && B % i == 0) {
                commonDivisors.add(i);
                if (commonDivisors.size() == K) {
                    break;
                }
            }
        }

        System.out.println(commonDivisors.get(K - 1));
    }

}



