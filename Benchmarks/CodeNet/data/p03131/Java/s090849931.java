import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int time = 0;
        long biscuits = 1;
        int money = 0;

        if (a + 1 >= b) {
            System.out.println(k + 1);
        } else {
            while (time < k) {
                if (money == 1) {
                    biscuits += b;
                    time++;
                    money--;
                } else if (biscuits < a || k - time == 1) {
                    biscuits++;
                    time++;
                } else {
                    biscuits -= a;
                    money++;
                    time++;
                }

            }
            System.out.println(biscuits);
        }
    }
}


