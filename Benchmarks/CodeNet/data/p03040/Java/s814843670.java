import java.lang.Math;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int F = sc.nextInt();

        List<Integer> as = new ArrayList<>();
        List<Integer> bs = new ArrayList<>();


        for (int i = 0; i < F; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                as.add(a);
                bs.add(b);
            }
            else {
                Collections.sort(as);
                int minX = as.get(as.size()/2);
                long sum = 0;
                for (int b : bs) {
                    sum += b;
                }
                for (int a : as) {
                    sum += Math.abs(minX - a);
                }

                System.out.print(minX);
                System.out.print(" ");
                System.out.println(sum);
            }
        }
    }
}
