import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(sc.next()));
        }
        String answer = "APPROVED";
        for (Integer i : list) {
            if ((i % 2) != 0) {
                continue;
            }
            if (((i % 3) == 0) || ((i % 5) == 0)) {
                answer = "APPROVED";
            } else {
                answer = "DENIED";
                break;
            }
        }
        System.out.println(answer);
        sc.close();
    }

}
