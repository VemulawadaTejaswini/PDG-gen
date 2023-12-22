import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(scan.nextInt());
        }
        Collections.reverse(a);
        for (int i = 0; i < n; i++) {
            if (i == a.size() -1) System.out.print(a.get(i));
            else System.out.print(a.get(i) + " ");
        }

    }

}