import java.util.*;

public class Main {
    public static void main(String args[]) {
        // input

        int num;

        Scanner inp = new Scanner(System.in);

        num = inp.nextInt();

        int[] numList = new int[num];

        int min = inp.nextInt();
        int max = 0;

        for (int i = 1; i < num; i++) {
            int r = inp.nextInt();
            max = Math.max(max, r-min);
            min = Math.min(min,r);
        }

        System.out.println(max);
    }
}

