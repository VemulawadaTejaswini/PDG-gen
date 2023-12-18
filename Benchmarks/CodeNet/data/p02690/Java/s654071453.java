import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        long array[] = new long[202];

        for (int i = 0; i <= 100; i++) {
            array[i] = i * i * i * i * i;
        }

        for (int i = 0; i <= 100; i++) {
            array[i + 101] = - (i * i * i * i * i);
        }

        for (int i = 0; i < 202; i++) {
            for (int j = 0; j < 202; j++) {
                if (array[i] - array[j] == x) {
                    if (i >= 100) {
                        i = -i + 101;
                    }

                    if (j >= 100) {
                        j = -j + 101;
                    }

                    System.out.println(String.valueOf(i) + " " + String.valueOf(j));
                    return;
                }

            }
        }




        sc.close();
    }

}