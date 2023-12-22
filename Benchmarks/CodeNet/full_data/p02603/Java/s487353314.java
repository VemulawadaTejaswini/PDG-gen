import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int money = 1000;
        int stock = 0;

        for (int i = 0; i < n; i++) {
            boolean flgup = false;
            boolean flgdown = false;
            for (int j = i; j < n; j++) {
                if (array[i] < array[j]){
                    flgup = true;
                }
                if (array[i] > array[j]){
                    flgdown = true;
                }
            }

            if (stock == 0) {
                if (flgup == true) {
                    while (money >= array[i]) {
                        stock++;
                        money -= array[i];
                    }
                }
            } else {
                if (flgdown == true || i == n - 1) {
                    while (stock > 0) {
                        stock--;
                        money += array[i];
                    }
                }
            }

        }

        System.out.println(money);

        sc.close();

    }

}