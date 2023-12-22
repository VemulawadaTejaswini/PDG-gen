import java.util.*;
//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();
        int i, count = 0;

        for (i = L; i <= R; i++) {
            if (i % d == 0)
                count++;
        }
        System.out.println(count);
    }
}