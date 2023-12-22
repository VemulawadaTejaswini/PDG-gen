

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println(new Main().run(sc));
        }
    }

    private String run(Scanner sc) {
        int count = 0;
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.next());
            if (n == 0) {
                count++;
            }
        }
        return Integer.toString(count);
    }

}
