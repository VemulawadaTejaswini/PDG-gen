import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] D = new Integer[3];

        for (int i = 0; i < 3; i++)
            D[i] = sc.nextInt();
        Arrays.sort(D);

        System.out.println(D[0] + D[1]);

    }
}
