import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList A = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        while (A.size() != 1) {
            Collections.sort(A);
            int tmp = 0;
            if ((int)A.get(A.size()-1) - (int)A.get(A.size()-2) > (int)A.get(A.size()-2)) {
                tmp = (int)A.get(A.size()-1) % (int)A.get(A.size()-2);
            } else {
                tmp = (int)A.get(A.size()-1) - (int)A.get(A.size()-2);
            }
            if (tmp <= 0) {
                A.remove(A.size()-1);
                continue;
            } else {
                A.remove(A.size()-1);
                A.add(tmp);
            }
        }

        System.out.println(A.get(0));
    }
}
