import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        long array[] = new long[1000];
        long array2[] = new long[1000];

        for (int i = 0; i < 1000; i++) {
            array[i] = i * i * i * i * i;
        }

        for (int i = 0; i < 1000; i++) {
            array2[i] = - (i * i * i * i * i);
        }

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if (array[i] - array2[j] == x) {
                    System.out.println(String.valueOf(i) + " " + String.valueOf(-j));
                    return;
                }

            }
        }

        sc.close();
    }

}
