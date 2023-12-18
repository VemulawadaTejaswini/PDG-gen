import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        List <Integer> list = new ArrayList<Integer>();
        for (int i = 3 ; i < 100000 ; i = i + 2) {
            if (is2017LikeNumber(i)) {
                list.add(i);
            }
        }
        int [] q = new int [Q];
        for (int i = 0 ; i < Q ; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count = 0;
            for (int j = 0 ; j < list.size() ; j++) {
                if (list.get(j) >= l && list.get(j) <= r) {
                    count++;
                }
            }
            q[i] = count;
        }
        for (int i = 0 ; i < Q ; i ++) {
            System.out.println(q[i]);
        }

    }

    private static boolean isPrimeNumber (int n) {
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean is2017LikeNumber (int n) {
        return isPrimeNumber(n) && isPrimeNumber((n + 1)/ 2);
    }

}