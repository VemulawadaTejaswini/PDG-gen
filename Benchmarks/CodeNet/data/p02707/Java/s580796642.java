import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> org = new ArrayList<>(n);
        for (int i = 0; i < n; i++) org.add(0);
        for (int i = 0; i < n-1; i++) {
            int tmp = sc.nextInt();
            org.set(tmp-1, org.get(tmp-1)+1);
        }
        for (var o : org) System.out.println(o);
    }
}