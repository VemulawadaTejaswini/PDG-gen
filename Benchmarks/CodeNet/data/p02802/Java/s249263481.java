
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int waCount = 0;
        int acCount = 0;

        List<Integer> acList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            String s = sc.next();

            if (acList.contains(Integer.valueOf(p))) {
                continue;
            }

            if ("WA".equals(s)) {
                waCount++;
            } else {
                acCount++;
                acList.add(p);
            }
        }
        System.out.println(acCount + " " + waCount);
    }

}