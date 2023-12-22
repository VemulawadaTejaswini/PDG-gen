package v0.n0022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int data_num = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            int max = 0;

            for (int i = 0; i < data_num; i++) {
                a.add(sc.nextInt());
            }

            int sum = 0;
            for (int i = 0; i < a.size(); i++) {
                for (int j = 2; j <= a.size(); j++) {
                    for (int k = 0; k <= j; k++) {
                        if (i + k < a.size()) {
                            sum += a.get(i + k);
                            max = Math.max(sum, max);
                        } else {
                            break;
                        }
                    }
                    sum = 0;
                }
            }
            System.out.println(max);
        }

    }
}