import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < N; i++) {
            String A = sc.next();
            if (!list.contains(A)) {
                list.add(A);
            } else {
                list.remove(A);
            }
        }
        System.out.println(list.size());
        sc.close();

    }
}